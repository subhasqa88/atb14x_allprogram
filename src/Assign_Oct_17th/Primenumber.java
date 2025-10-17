package Assign_Oct_17th;

import java.util.Scanner;

public class Primenumber
{
    public static void main(String[] args) {
        int count=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scn.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(number%i==0){
                count= count++;
            }
        }
        if(count==2)
        {
            System.out.println("number is a prime number");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
