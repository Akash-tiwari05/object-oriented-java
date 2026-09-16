package stream.bingopool;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * BingoChallenge demonstrates 5 completely different architectural design patterns
 * to generate and streaming data sequences using the Java Streams API.
 *
 * @author Your Name
 * @see <a href="https://github.com">My GitHub Portfolio</a>
 */
public class BingoChallenge {

    // Thread-unsafe static counter used for Way #5 generation.
    // NOTE: In production environments or parallel execution contexts,
    // an AtomicInteger or stateless mapping approach should be used instead.
    static int counter = 0;

    public static void main(String[] args) {

        // ==========================================
        // BASE SEED DECLARATION
        // ==========================================
        int bSeed = 1;

        // ==========================================
        // WAY 1: Stream.iterate (3-Argument Predicate Loop)
        // Introduced in Java 9, mimics a standard bounded for-loop statefully.
        // ==========================================
        var bPool = Stream.iterate(bSeed, i -> i < bSeed + 15, i -> i + 1)
                .map(i -> "B" + i);

        // ==========================================
        // WAY 2: Stream.iterate (2-Argument Infinite) + limit()
        // Creates an infinite sequential stream, explicitly truncated using short-circuit operations.
        // ==========================================
        int iSeed = incrementSeed(bSeed);
        var iPool = Stream.iterate(iSeed, i -> i + 1)
                .limit(15)
                .map(i -> "I" + i);

        // ==========================================
        // WAY 3: Arrays.setAll() + Arrays.stream()
        // Pre-allocates a fixed array structure, populates indices using lambda logic,
        // and converts the primitive backing store into a standard Stream.
        // ==========================================
        int nSeed = incrementSeed(iSeed);
        String[] nLabel = new String[15];
        Arrays.setAll(nLabel, i -> "N" + (nSeed + i));
        var nPool = Arrays.stream(nLabel);

        // ==========================================
        // WAY 4: Stream.of() Hardcoded Eager Initialization
        // Explicitly hardcodes matching sequences into memory, serving as a clean baseline
        // for statically known dataset requirements.
        // ==========================================
        int gSeed = incrementSeed(nSeed);
        var gPool = Stream.of(
                "G46", "G47", "G48", "G49", "G50", "G51", "G52", "G53", "G54", "G55",
                "G56", "G57", "G58", "G59", "G60"
        );

        // ==========================================
        // WAY 5: Stream.generate() Lazy Supplier Pattern
        // Employs a custom functional method reference interface to evaluate elements
        // infinitely on-demand based on changing external runtime states.
        // ==========================================
        int oSeed = incrementSeed(gSeed);
        var oPool = Stream.generate(BingoChallenge::getCounter)
                .limit(15)
                .map(i -> "O" + (oSeed + i));

        // ==========================================
        // COMBINATION & EXECUTION PIPELINE
        // Flattens the separate independent collection tracks into a unified
        // continuous data pipeline using functional flatMap architecture.
        // ==========================================
        Stream.of(bPool, iPool, nPool, gPool, oPool)
                .flatMap(stream -> stream)
                .forEach(System.out::println);
    }

    /**
     * Calculates the uniform starting offset matrix point for successive Bingo blocks.
     *
     * @param seed The starting boundary integer of the previous column block.
     * @return The next starting boundary coordinate block offset by 15 units.
     */
    private static int incrementSeed(int seed) {
        return seed + 15;
    }

    /**
     * Volatile internal getter mutation function to step data generation sequentially.
     *
     * @return Current tracking sequence integer right before adding scale increments.
     */
    private static int getCounter() {
        return counter++;
    }
}
