package Assign_Oct_10th;

import java.util.Scanner;

public class NumberevenOrOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scn.nextInt();
        if(number%2==0){

            System.out.println("given number is even number");
        }
        else {
            System.out.println("given number is odd number");
        }
    }
}
