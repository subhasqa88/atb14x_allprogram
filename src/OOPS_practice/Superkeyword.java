package OOPS_practice;

class test5 {
    int a = 10;

    test5(int a) {
        this.a = a;
    }
}

public class Superkeyword extends test5 {
    Superkeyword() {
        super(23);
    }

    public static void main(String[] args) {
        Superkeyword s=new Superkeyword();
        System.out.println(s.a);

    }
}
