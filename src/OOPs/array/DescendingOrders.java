package OOPs.array;

import java.util.Arrays;
import java.util.Random;

public class DescendingOrders {

    public static void main(String[] args) {
        int[] arr = randomArray(10);
        System.out.println(Arrays.toString(arr));

        /*System.out.println("Ascending order: "+Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }*/

        System.out.println("Descending order:"+
                Arrays.toString(sortIntegers(arr)));
    }

    private static int[] randomArray(int length){

        Random random = new Random();

        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }

    private static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}
