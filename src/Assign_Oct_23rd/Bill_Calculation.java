package Assign_Oct_23rd;

import java.util.Scanner;

public class Bill_Calculation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter electric_unit");
        double electric_unit= scn.nextDouble();
        double billamount=0;

        if(electric_unit<=100){
            System.out.println("0.50Rs per unit");
            billamount=electric_unit*0.50;
            System.out.println("billamount is "+billamount );
        }
        else if (electric_unit>100 & electric_unit<=200){
            System.out.println("0.57Rs per unit");
            billamount=electric_unit*0.57;
            System.out.println("billamount is "+billamount );
        }
        else if (electric_unit>200 & electric_unit<=300){
            System.out.println("1.20Rs per unit");
            billamount=electric_unit*1.20;
            System.out.println("billamount is "+billamount );
        }
        else if  (electric_unit>300 )
        {
            System.out.println("1.50Rs per unit");
            billamount=electric_unit*1.500;
            System.out.println("billamount is "+billamount );
        }


    }
}
