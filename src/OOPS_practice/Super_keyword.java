package OOPS_practice;

public class Super_keyword extends testb
{
     static int age=34;
    void run()
    {
        System.out.println("dancing");
        System.out.println(super.age);
        super.run();
    }
    //super.age;



    public static void main(String[] args)
    {
        //System.out.println(age);
       //s.run();

        //System.out.println(this.age);
        testb f=new testb();
        f.testcry();


    }
}
class testb extends testc{
    int age=45;
    void testcry(){
        System.out.println("crying");
        super.run();
        System.out.println(this.age);

    }
}


class testc
{
void run()
{
    System.out.println("running");
}
 int age=40;

}



