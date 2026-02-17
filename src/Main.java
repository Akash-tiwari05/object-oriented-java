
public class Main {
    public static void main(String[] args) {

        System.out.println("24 inches = "+convertToCentimeters(24)+"cm");
        System.out.println(convertToCentimeters(5,10));

        
    }

    public static double convertToCentimeters(int inches){
        //System.out.println(inches+" inches = "+ inches*2.54d +"cm");
        return inches*2.54d;
    }
    public static double convertToCentimeters(int feet,int inches){
        int feetToInches = feet*12+inches;
        double centimeters = convertToCentimeters(feetToInches);
        System.out.println(feet+ " feet "+inches+" inches = " + feetToInches*2.54);
        return centimeters;

    }
}