//swap numbers using third value
package conditional;

import java.util.Scanner;

public class swap_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a ");
        int a= sc.nextInt();
        System.out.println("enter value of b");
        int b= sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
//        without using third variable
//        a=10
//        b=20
//        a=a+b;
//        b=a-b;
//        a=a-b;
        System.out.println("value of a is:"+a);
        System.out.println("value of b is:"+b);


    }

}
