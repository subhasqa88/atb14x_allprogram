package Assign_Oct_11th;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rightangletrangle {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter number");
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
