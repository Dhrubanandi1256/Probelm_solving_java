package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class largest_num {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n =sc.nextInt();
        int[] a = new int [n];
        int max=a[0];
        System.out.print("enter the array element");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximum element is :"+max);
    }

}
