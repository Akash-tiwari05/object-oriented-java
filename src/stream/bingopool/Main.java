package stream.bingopool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);
        int start = 1;

        for (char c : "BINGO".toCharArray()){
            for (int i = start; i < start+ 15; i++) {
                bingoPool.add(""+c+i);
            }
            start += 15;
        }

        Collections.shuffle(bingoPool);
        for (int i = 0; i < 15; i++) {
            System.out.println(bingoPool.get(i));
        }

        System.out.println("_".repeat(50));

        List<String> firstOne = bingoPool.subList(0,15);
        firstOne.sort(Comparator.naturalOrder());
        firstOne.replaceAll(s-> {
            if (s.startsWith("G") || s.startsWith("O")) {
                String update = s.charAt(0) + "-" +s.substring(1);
                System.out.print(update+" ");
                return update;
            }
            return s;
        });

        System.out.println("\n-----------------------------------------");
        //System.out.println(bingoPool);

        //using stream
        bingoPool.stream()
                .limit(15)
                .filter(s -> s.startsWith("G") || s.startsWith("O"))
                .map(s -> s.charAt(0) + "-" +s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\n-----------------------------------------");
    }
}
