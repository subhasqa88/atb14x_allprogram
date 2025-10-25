package Assign_Oct_24th;

import java.util.Scanner;

public class Seniorcitizen_eligibility {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter age");
        int age=scn.nextInt();
        if(age>0 & age<=12)
        {
            System.out.println("it is a child");
        } else if (age>=13 & age<=19)
        {
            System.out.println("it is a teenager");
        }
        else if (age>=20 & age<=64)
        {
            System.out.println("it is a adult");
        }
        else if (age>=65 )
        {
            System.out.println("it is a Senior Citizen");
        }

    }
}
