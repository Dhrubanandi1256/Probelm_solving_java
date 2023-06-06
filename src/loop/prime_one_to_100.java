package loop;
import java.util.Scanner;

public class prime_one_to_100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range");
        int n= sc.nextInt();
        int temp=0;
        for(int i=1;i<=n;i++){
            //int temp=0

            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==0){
                System.out.println(i);
            }
            else {
              temp=0;
            }
        }


    }
}
