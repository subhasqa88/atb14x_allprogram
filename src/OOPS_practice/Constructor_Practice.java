package OOPS_practice;

public class Constructor_Practice {
    private static test1 a;

    public static void main(String[] args) {

        //test1 a = new test1();
        test1 a = new test1(30);
        System.out.println(a.i);
    }

    static class test1 {
        int i ;

        test1(int i)
        {
            this.i=i;
        }
    }
}


