package Assign_Oct_17th;

import java.util.Scanner;

public class Character_alphabet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the input");
        char c=scn.next().charAt(0);

        if((c>='a' && c<='z' )||(c>='A' && c<='Z' ))
        {
            System.out.println("enter one is an alpahbet");
        }
        else
        {
            System.out.println("enter one is not an alpahbet");
        }

        }
    }

