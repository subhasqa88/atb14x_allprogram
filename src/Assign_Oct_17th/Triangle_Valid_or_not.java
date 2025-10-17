package Assign_Oct_17th;

import java.util.Scanner;

public class Triangle_Valid_or_not {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter side_1");
        int side_1 = scn.nextInt();

        System.out.println("enter side_2");
        int side_2 = scn.nextInt();

        System.out.println("enter side_3");
        int side_3 = scn.nextInt();
        if (side_1 > 0 && side_2 > 0 && side_3 > 0) {
            if ((side_1 + side_2 > side_3) && (side_1 + side_3 > side_2) && (side_2 + side_3 > side_1)) {
                System.out.println("triangle is valid");

            }
        }
        else {
            System.out.println("negative and zero  not alowed");
        }



    }
}
