import java.sql.SQLOutput;
import java.util.Scanner;

public class Firstletterofstring {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter a string");
        String a=scn.next();
        System.out.println(a.charAt(0));
    }
}
