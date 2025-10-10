package Assign_Oct_10th;

import java.util.Scanner;

public class Vowel_Or_Constant {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a character");
        String letter=scn.next();

        switch(letter){
            case "a":
                System.out.println("letter is a vowel");break;
            case "e":System.out.println("letter is a vowel");break;
            case "i":System.out.println("letter is a vowel");break;
            case "o":System.out.println("letter is a vowel");break;
            case "u":System.out.println("letter is vowel");break;
            default:System.out.println("letter is a consonant");
        }





    }
}
