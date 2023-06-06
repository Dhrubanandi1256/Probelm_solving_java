package loop;


import java.util.Scanner;

public class reverse_num {
    public  static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        int rev=0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println("the reverse num is:" +rev);



    }


}
//package loop;
//public class reverse_num
//{
//    public static void main(String[] args)
//    {
//        int number = 123456, reverse = 0;
////we have not mentioned the initialization part of the for loop
//        for( ;number != 0; number=number/10)
//        {
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);
//    }
//}