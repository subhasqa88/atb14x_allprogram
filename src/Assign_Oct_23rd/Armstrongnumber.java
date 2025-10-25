package Assign_Oct_23rd;

public class Armstrongnumber {
    public static void main(String[] args) {
        int num = 153;
        int digits=String.valueOf(num).length();

        int originalnum=num;

        int sum = 0;


        while ( num>0) {
            int digit=(num%10);
            sum= (int) (sum+Math.pow(digit,digits));
            num=num/10;

        }
        System.out.println("sum is "+ sum);
        if (originalnum == sum)
        {
            System.out.println("number is Armstrongnumber");
        }
        else {
            System.out.println("number is  not Armstrongnumber");
        }
    }
}
