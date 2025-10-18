package OOPS_practice;

class test3
{
   int a=20;
   void testing()
   {
       System.out.println("testing");

   }
}
class test4 extends test3
{
    int a=20;
    void testing()
    {
        System.out.println("testing new");

    }
}

public class Overridingpractice {
    public static void main(String[] args) {
        test3 a1=new test3();
        a1.testing();


    }
}
