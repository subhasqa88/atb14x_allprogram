import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exceptions {
    public static void main(String[] args) {
        int number=10;
        int number1=15;
        try {
            int result=number/0;
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("exception message"+ e);
        }
        try {
            int result=number+number1;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("exception message"+ e);
        } finally {
            System.out.println("finally block executed");
        }
        Queue<Integer> queue1=new PriorityQueue<>();
        queue1.add(23);
        queue1.add(345);
        queue1.add(567);
        queue1.add(4);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
    }
}
//checked exception----Io excetion,filenotfound excetion,Sql excetion,classnot found excetion
//unchecked exception---Arithematic exception,null pointer exception,numv=ber format exception,Array out of bound excetion
