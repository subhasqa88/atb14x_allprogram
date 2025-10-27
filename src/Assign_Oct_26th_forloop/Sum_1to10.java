package Assign_Oct_26th_forloop;

public class Sum_1to10 {
    static int sum;

    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
          sum=sum+i;
        }
        System.out.println("sum is "+ sum);
    }
}
