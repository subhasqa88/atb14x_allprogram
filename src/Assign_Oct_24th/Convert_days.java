package Assign_Oct_24th;

import java.util.Scanner;

public class Convert_days
{
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("enter days");
        int totaldays=scn.nextInt();
        int year=totaldays / 365;
        int remainingdays=totaldays%365;

        int months=remainingdays/ 30;
        int days=remainingdays%30;

        System.out.println(year+"year"+months+"months"+days+"days");


    }
}
