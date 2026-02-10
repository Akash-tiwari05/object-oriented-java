package OOPs.array;

import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {

        String[] sArray = {"Able","Jenny","Mark","Rohit","Amber"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray,"Mark") >= 0){
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
