package Assign_Oct_23rd;

import java.util.Scanner;

public class Net_Salary {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter gross sal");
        double grosssal=scn.nextInt();
        System.out.println("enter HRA");
        double HRA=scn.nextInt();
        System.out.println("enter basicpay");
        double basicpay=scn.nextInt();
        System.out.println("enter DA");
        double DA=scn.nextInt();
        double tax=basicpay*0.05;
        double netsal=grosssal-(HRA+basicpay+DA);
        System.out.println("netsal is"+ netsal);
    }
}
