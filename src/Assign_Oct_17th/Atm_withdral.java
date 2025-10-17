package Assign_Oct_17th;

import java.util.Scanner;

public class Atm_withdral
{
    public static void main(String[] args) {
        int account_balance=10000;

        try{
            Scanner scn=new Scanner(System.in);
            System.out.println("enter amount");
            int amount=scn.nextInt();
        if(amount>0 && amount<account_balance && amount%100==0)
        {
            account_balance=account_balance-amount;
            System.out.println("Updated balnce is "+ account_balance);
        }
        }
        catch (Exception e) {
            System.out.println("withdrawal limit is wrong");
            throw new RuntimeException(e);

        }

    }
}
