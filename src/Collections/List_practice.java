package Collections;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_practice {
    public static void main(String[] args) {
        List<Integer> lst= new ArrayList<Integer>();
        lst.add(2);
        lst.add(562);
        lst.add(782);
        lst.add(2890);
        System.out.println(lst);
        System.out.println(lst.get(0));
        for(int l:lst)
        {
            System.out.println(l);
        }

        Iterator itr=lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
