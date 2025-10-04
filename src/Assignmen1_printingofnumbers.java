import java.sql.SQLOutput;

public class Assignmen1_printingofnumbers {
    int i=0;

    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if (i % 5 == 0 && i %3 == 0)
            {
                System.out.println("FizzBuz");
                continue;
            }
            if(i %3==0)
            {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0)
            {
                System.out.println("Buzz");
                continue;
            }

            else
                System.out.println(i);{

            }


        }
    }
}
