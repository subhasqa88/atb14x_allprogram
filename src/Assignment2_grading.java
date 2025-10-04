import java.util.Scanner;

public class Assignment2_grading {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the mark");
        int a= scn.nextInt();
        if (a>=90 && a <=100 )
        {
            System.out.println("Grade is A");

        }
        else if (a>=80 && a <=89 )
        {
            System.out.println("Grade is B");
        }
        else if (a>=70 && a <=79 )
        {
            System.out.println("Grade is c");
        }
        else if (a>=60 && a <=69 )
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("Grade is F");
        }
    }
}
