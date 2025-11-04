import java.util.ArrayList;

public class Wrapperclass_practice {
    public static void main(String[] args) {
        String  name="123";
        int name1=Integer.parseInt(name);
        System.out.println("name1");
        String  rollno="123";
        double  rollno1=Double.parseDouble(rollno);
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        list1.add(90);
        list1.add(78);
        System.out.println(list1);
        int mark=20;
        String mark1=String.valueOf(20);
        System.out.println(mark1);
    }
}
