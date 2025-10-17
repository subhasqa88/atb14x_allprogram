package Assign_Oct_17th;

import java.util.Scanner;

public class Smallestof_3nos {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first number");
        int number_1st=scn.nextInt();
        System.out.println("Enter second number");
        int number_2nd=scn.nextInt();
        System.out.println("Enter third number");
        int number_3rd=scn.nextInt();
        String result=(number_1st<number_2nd)?(number_1st<number_3rd)?"number_1stis smallest":"number_3rd is smallest":(number_2nd<number_3rd)?"number_2ndis smallest":"number_3rd is smallest";
        System.out.println("smallest number is "+result);
    }
}
