package ARRAY;
import java.util.Arrays;
import java.util.Scanner;


public class print {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //CREATING ARRAY
        int[] a=new int[5];
        System.out.println("enter the element of an array");
        //INPUT USING FOR LOOP
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        //PRINT ARRAY
        for(int i=0;i<a.length;i++)

        System.out.print(a[i] + "," );
        //ANOTHER TYPE OF PRINT
        for(int i:a){
            System.out.println("another way"+i);
        }
        //3RD WAY TO PRINT
        System.out.println(Arrays.toString(a));





    }
}
