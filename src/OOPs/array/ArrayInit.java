package OOPs.array;

import java.util.Arrays;

public class ArrayInit {

    public static void main(String[] args) {

        //using new method
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = i;
        }

        System.out.println("length of array = "+arr.length);
        System.out.println("last = "+ arr[arr.length-1]);

        //direct init
        int[] arr1 = {1,2,3,4,5};


        int[] newArr;
        newArr = new int[]{1,2,3,4,5,6};

        System.out.println(Arrays.toString(newArr));

        /// arrays are as treated as any other object in java
        Object objectVariable = newArr;
        if(objectVariable instanceof int[]){
            System.out.println("Object really should be int array");
        }

        ///create an array of an objects
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = new int[]{2,3,4};

        System.out.println(Arrays .toString(objectArray));


    }
}
