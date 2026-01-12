package OOPs.pojo;

import OOPs.bankdetails.challange.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S95000"+i,
                    switch(i){
                        case 1 -> "Mary";
                        case 2-> "Akash";
                        case 3 -> "Aryan";
                        case 4 -> "Priya";
                        case 5 -> "Harshit";
                        default -> "Invalid Input";
                    },
                    switch(i){
                        case 1 -> "01/20/2003";
                        case 2-> "05/05/2001";
                        case 3 -> "3/07/2007";
                        case 4 -> "09/05/2001";
                        case 5 -> "12/07/2003";
                        default -> "Invalid Input";
                    },
                    switch(i){
                        case 1 -> "Science";
                        case 2 -> "Computer Science";
                        case 3 -> "Social Science";
                        case 4 -> "MatheMetics";
                        case 5 -> "DBMS";
                        default -> "Invalid Input";
                    });
            System.out.println(s);
        }
    }
}
