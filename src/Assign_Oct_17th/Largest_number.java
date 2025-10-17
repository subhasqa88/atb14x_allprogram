package Assign_Oct_17th;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first number");
        int number_1st=scn.nextInt();
        System.out.println("Enter second number");
        int number_2nd=scn.nextInt();
        System.out.println("Enter third number");
        int number_3rd=scn.nextInt();
        String result=(number_1st>number_2nd)?(number_1st>number_3rd)?"number_1st is max number":"number_3rd is max number":(number_2nd>number_3rd)?"number_2nd is max number":"number_3rd is max number";
        //(number_1st>number_2nd)?"number_1st is max number":"number_1st is max number";
        System.out.println("max number is ="+ result);
    }

}
