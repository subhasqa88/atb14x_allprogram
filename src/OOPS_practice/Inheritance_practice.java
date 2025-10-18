package OOPS_practice;

class test1
{
    int i=20;
    void run()
    {
        System.out.println("test 1 method");
    }
    void sing()
    {
        System.out.println("test1 will sing");
    }
}

class test2 extends test1
{
   int h=20;
    void run()
    {
        System.out.println("test 2method");
    }
}

public class Inheritance_practice
{
    public static void main(String[] args) {
        test2 t2=new test2();
        test1 t1=new test2();

        t2.run();
        t1.run();
        t2.sing();
    }
}


