package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map_practice {
    public static void main(String[] args) {
        Map<Integer,String> mp1=new HashMap<Integer,String>();
        mp1.put(1,"abc");
        mp1.put(2,"abc123");
        mp1.put(4,"subnsabc");
        mp1.put(6,"pintabc");
        System.out.println(mp1);
        System.out.println(mp1.get(6));
        Set st= mp1.keySet();
        System.out.println("itertor started");
        Iterator itr=mp1.keySet().iterator();
        while (itr.hasNext()){
            Integer key= (Integer) itr.next();
            String value=mp1.get(key);
            System.out.println(key+"="+value );
            System.out.println("itertor ended");


        }
        System.out.println("------------");
        System.out.println();
        System.out.println(mp1.keySet());
        System.out.println(mp1.entrySet());
        System.out.println(mp1.values());
    }

}
