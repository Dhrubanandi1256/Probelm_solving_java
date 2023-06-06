package loop;

import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        //int res=0;
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){

           // res=n*i;
            //System.out.println(n +"x"+i +"="+res);
            System.out.println(n +"x"+i +"="+n*i);
        }


    }
}
