package Assign_Oct_23rd;

import java.util.Scanner;

public class Bonus_Calculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter yesr of experiance");
        int yearof_experiance = scn.nextInt();
        System.out.println("Enter salary");
        int sal = scn.nextInt();
        int bonus=0 ;
        if (yearof_experiance <1)
        {
            System.out.println("Bonus is" + 0);
        }
        else if (yearof_experiance >= 1 & yearof_experiance <= 3)
        {
            System.out.println("Bonus is"+sal*0.5);
        }
        else if (yearof_experiance >= 4 & yearof_experiance <= 6)
        {
            System.out.println("Bonus is"+sal*0.10);
        }
        else if (yearof_experiance>6)
        {
            System.out.println("Bonus is"+sal*0.15);
        }
    }
}
