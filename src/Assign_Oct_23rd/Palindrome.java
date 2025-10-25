package Assign_Oct_23rd;

public class Palindrome {
    public static void main(String[] args) {
        int num =555;
        int originalnum=num;
        String rev="";
        //int rem;
       while(num!=0){
           rev=rev+""+num%10 ;
           num=num/10;

       }
        System.out.println(Integer.parseInt(rev));
       if (originalnum==Integer.parseInt(rev)){
           System.out.println("number is a pailndrome");
       }
       else {
           System.out.println("number is not  a pailndrome");
       }


       }



    }

