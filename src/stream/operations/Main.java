package stream.operations;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Three"};

        // Create a stream from the array and sort the elements in reverse order.
        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());

        // Create a stream from individual values and convert each value to uppercase.
        var secondStream = Stream.of("Four", "Five", "Six")
                .map(String::toUpperCase);

        // Combine both streams, display the first character and the complete string.
        Stream.concat(secondStream, firstStream)
                .map(s -> s.charAt(0) + " -> " + s)
                .forEach(System.out::println);

        // Create a Bingo number map.
        // Each letter is associated with a range of 15 numbers.
        Map<Character, int[]> myMap = new LinkedHashMap<>();

        int bingoIndex = 1;

        for (char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            int labelNo = bingoIndex;

            // Fill the array with 15 consecutive numbers.
            Arrays.setAll(numbers, i -> i + labelNo);

            myMap.put(c, numbers);
            bingoIndex += 15;
        }

        // Convert the map entries into a stream and display each letter's number range.
        myMap.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range: "
                        + e.getValue()[0]
                        + " - "
                        + e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);

        // Generate 10 random numbers containing either 0 or 1.
        Random random = new Random();

        Stream.generate(() -> random.nextInt(2))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------");

        // Generate an infinite stream of numbers starting from 1.
        // Filter the stream to keep only prime numbers and stop after 20 primes.
        IntStream.iterate(1, n -> n + 1)
                .filter(Main::isPrime)
                .limit(20)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------");

        // Generate numbers from 1 onward, limit the stream to 100 numbers,
        // then filter out the non-prime numbers.
        IntStream.iterate(1, n -> n + 1)
                .limit(100)
                .filter(Main::isPrime)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------");

        // Generate numbers starting from 1 while the value is <= 100.
        // Keep only prime numbers.
        IntStream.iterate(1, n -> n <= 100, n -> n + 1)
                .filter(Main::isPrime)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------");

        // Generate numbers from 1 (inclusive) to 100 (exclusive)
        // and print only the prime numbers.
        IntStream.range(1, 100)
                .filter(Main::isPrime)
                .forEach(s -> System.out.print(s + " "));
    }

    /**
     * Checks whether a number is prime.
     * A prime number is greater than 1 and has no divisors
     * other than 1 and itself.
     */
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        // We only need to check divisors up to the square root of n.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}