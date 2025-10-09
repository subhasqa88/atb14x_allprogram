package String;

import java.util.Arrays;

public class Stringfunctions {
    static String name="subhas";

    public static void main(String[] args) {
        System.out.println(name.length());
        StringBuilder builder=new StringBuilder(name);

        System.out.println(builder.reverse());

       String []array1= name.split(",");
        System.out.println(Arrays.toString(array1));

    }

}

