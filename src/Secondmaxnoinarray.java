import java.util.Arrays;

public class Secondmaxnoinarray {
    public static void main(String[] args) {
        int a[] = {13, 99, 45, 56, 100};
        int length = a.length;
        System.out.println(length);
        int temp ;
        for (int i = 0; i < length; i++)
        {
           for (int j = i+1; j < length; j++)
           {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }

           }
        }

        for(int p:a){
            System.out.println(p);

        }

        int secondmaxindex=a.length-2;
        System.out.println(a[secondmaxindex]);


    }
}

