package Assign_Oct_10th;

import java.util.Scanner;

public class Maximumnumber {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("enter a number");
        int number1=scn.nextInt();
        System.out.println("enter a number");
        int number2=scn.nextInt();
        String num=(number1>number2)? "number1_is big":"number2 is big";
        System.out.println(num);
    }
}
