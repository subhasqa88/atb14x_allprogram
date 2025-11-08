package Collections;

import java.util.*;

public class set_Practice {
    public static void main(String[] args) {
        Set st=new HashSet<>();
        st.add(34);
        st.add(553);
        st.add(3678);
        st.add(38);
        st.add(302);
        System.out.println(st);
        System.out.println(st.contains(38));
        System.out.println("converted to list");
        List lst1=new ArrayList(st);
        System.out.println(lst1);
        System.out.println(lst1.get(2));
        Iterator itr=st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }







    }
}
