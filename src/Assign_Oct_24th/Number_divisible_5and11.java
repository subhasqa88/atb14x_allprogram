package Assign_Oct_24th;

import java.util.Scanner;

public class Number_divisible_5and11 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("enter number");
        int num = scn.nextInt();
        if (num % 5 == 0 & num % 11 == 0) {
            System.out.println("num is divisible by 5 and 11");
        } else {
            System.out.println("num is  not divisible by 5 and 11");
        }
    }
}
