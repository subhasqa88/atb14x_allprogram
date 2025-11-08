package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_Practice {
    public static void main(String[] args) {
        List<Integer> lst=new LinkedList<>();
        lst.add(2);
        lst.add(45);
        lst.add(67);
        System.out.println(lst);
        System.out.println(lst.get(2));
        System.out.println(lst.getFirst());
        System.out.println(lst.size());
        lst.set(2,5690);
        System.out.println(lst);

    }
}
