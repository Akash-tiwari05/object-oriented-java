package OOPs.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {

        int[] arr = readIntegers();
        System.out.println(Arrays.toString(arr));

        System.out.println("Minimum value: "+minValues(arr));

    }

    private static int[] readIntegers(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of integers, separated by commas:");
        String s = sc.nextLine();
        String[] splits = s.split(",");
        int[] arr = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            arr[i] = Integer.parseInt(splits[i]);
        }

        return arr;
    }

    private static int minValues(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for (int ele : arr){
            minValue = Math.min(ele,minValue);
        }

        return minValue;
    }
}
