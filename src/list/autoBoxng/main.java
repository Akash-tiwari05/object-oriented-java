package list.autoBoxng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); //preferred but unnecessary
        //Integer deprecatedInt = new Integer(15); //deprecated
        int unboxedInt = boxedInt.intValue();//preferred but unnecessary

        //autoboxing
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());

        Double resultAutoboxing = getLiteralsDoublePrimitive();
        System.out.println(resultAutoboxing);
        double resultUnAutoboxing = getDouble();
        System.out.println(resultUnAutoboxing);

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        Character[] c = {'a','b','c','d'};
        System.out.println(Arrays.toString(c));

        var ourList = getAList(1,2,4,5,6);
        System.out.println(ourList);

        System.out.println(returnAnInt(23));
        System.out.println(returnAnInteger(23));
    }

    public static List<Integer> getAList(int... varargs){

        List<Integer> alist = new ArrayList<>();
        for(int i: varargs){
            alist.add(i);
        }
        return alist;
    }


    public static int returnAnInt(Integer i){
        return i;
    }

    public static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getDouble(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralsDoublePrimitive(){
        return 100.0;
    }
}
