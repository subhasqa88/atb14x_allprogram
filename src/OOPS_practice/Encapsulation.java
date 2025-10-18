package OOPS_practice;
class test6
{
    public int getA() {
        System.out.println(a);
        return a;

    }

    public void setA(int a) {
        this.a = a;
    }

    private int a=10;

}

public class Encapsulation {
    public static void main(String[] args) {
        test6 s=new test6();
        s.getA();

    }

}
