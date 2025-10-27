package OOPS_practice;

public class TestSubhas extends  test12 {
    int age =66;
    void printage(){
        System.out.println(this.age);
        System.out.println(super.age);
    }
    void dance(){
        System.out.println("child method  call");
        super.dance();
    }

    public static void main(String[] args) {
        TestSubhas s=new TestSubhas();
        s.printage();
        s.dance();

    }

}
class test12{
    int age=34;
    void dance(){
        System.out.println("parenmethod call");
    }

}

