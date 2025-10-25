package Assign_Oct_23rd;

import java.util.Scanner;

public class Visa_status {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("enter age");
        int age=scn.nextInt();
        System.out.println("enter visa status");
        String visa_status=scn.next();
        if(age>0 & age>18 & visa_status.equals("valid")){
            System.out.println("person can travel");
        }
        else
        {
            System.out.println("person cannot travel");
        }

    }

}
