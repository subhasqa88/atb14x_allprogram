package OOPS_practice;

class ex1{
    void display()
    {
        System.out.println("display first mesthod");
    }
    void display(int a)
    {
        System.out.println("display second mesthod");
    }
}

public class Overloading {
    public static void main(String[] args) {
        ex1 ex=new ex1();
        ex.display();
        ex.display(10);

    }
}
