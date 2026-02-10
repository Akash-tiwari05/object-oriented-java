package OOPs.array;

import java.util.Arrays;
import java.util.Random;

public class UsingArray {

    public static void main(String[] args) {

        int[] firstArray = randomArray(7);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = randomArray(10);
        System.out.println("third = "+Arrays.toString(thirdArray));

        int[] forthArray = Arrays.copyOf(thirdArray,10);//deep copy
        forthArray[7] = 25;
        System.out.println("forth = "+Arrays.toString(forthArray));
        System.out.println("third = "+Arrays.toString(thirdArray));
    }

    public static int[] randomArray(int length){

        Random random = new Random();

        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }
}
