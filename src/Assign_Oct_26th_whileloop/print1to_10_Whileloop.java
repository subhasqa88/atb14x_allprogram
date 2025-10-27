package Assign_Oct_26th_whileloop;

public class print1to_10_Whileloop {
    public static void main(String[] args) {
        int i=0;
        boolean status=true;
        while(true){
            i=i+1;
            System.out.print(i+ " ");
            if(i>10){
                status=false;
                break;

            }

        }
    }
}
