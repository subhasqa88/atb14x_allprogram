package Assign_Oct_24th;

import java.util.Scanner;

public class Typeof_website {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter website");
        String website=scn.next();

        if(website.contains("example.com")){
            System.out.println("The website type is: Commercial website");

        } else if (website.contains("example.org")) {
            System.out.println("The website type is: Non-profit organization");
        }
        else if (website.contains("example.edu")) {
            System.out.println("The website type is: Educational institution");
        }
        else if (website.contains("example.gov")) {
            System.out.println("The website type is: Government website");
        }
        else if (website.contains("example.net")) {
            System.out.println("The website type is: Network-related website");
        }
        else if (website.contains("example.info")) {
            System.out.println("The website type is: Informational website");
        }
        else if (website.contains("example.xyz")) {
            System.out.println("The website type is: Informational website");
        }

    }

}
