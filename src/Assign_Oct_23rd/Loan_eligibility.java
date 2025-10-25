package Assign_Oct_23rd;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loan_eligibility {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = scn.nextInt();
        System.out.println("Enter salary ");
        double salary = scn.nextDouble();
        System.out.println("Enter creditscore ");
        int creditscore = scn.nextInt();
        if (age > 0 & age > 18 & age <= 80) {
            System.out.println("age is elgible");
        } else {
            System.out.println("age is  not elgible");
        }
        if (salary > 0 & salary >= 30000) {
            System.out.println("salary can be processed");
        } else {
            System.out.println("salary cannot  be processed");
        }
        if (creditscore > 0 & creditscore > 650 & creditscore < 850) {
            System.out.println("creditscore  eligible");
        } else {
            System.out.println("creditscore not eligible");

        }
    }
}
