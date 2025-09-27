import java.util.Scanner;

public class Scannerclasspractice {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
        int a=scn.nextInt();
        if(a>10)
        {
            System.out.println("correct number");
        }
        else
        {
            System.out.println("incorrect number");
        }
    }
}
