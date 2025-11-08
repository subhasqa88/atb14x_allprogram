package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_practice {
    public static void main(String[] args) {
        Queue qe1=new PriorityQueue();
        qe1.add(2);
        qe1.add(62);
        qe1.add(2890);
        qe1.add(256);
        System.out.println(qe1);
        System.out.println(qe1.peek());
        System.out.println(qe1.poll());

    }
}
