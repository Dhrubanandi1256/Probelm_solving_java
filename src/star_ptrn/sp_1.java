package star_ptrn;

import java.util.Scanner;

public class sp_1 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int row=0;row<=n;row++){
//            for(int col=n;col>=row;col--){
//                System.out.print(" * ");
//            }
            for(int col=1;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
