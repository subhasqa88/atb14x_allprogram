package Assign_Oct_17th;

import java.util.Scanner;

public class Smallest_2nos
{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first number");
        int number_1st=scn.nextInt();
        System.out.println("Enter second number");
        int number_2nd=scn.nextInt();
        String result=(number_1st<number_2nd)?"number_1st is smallest":"number_2nd is smallest";
        System.out.println("smallest no is"+ result);
    }
}
