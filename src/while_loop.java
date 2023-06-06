import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number: ");
        int n= sc.nextInt();
        int count=1;
        System.out.println("the numbers are");
        while (count!=n){
            System.out.println(count);
            count++;
        }


    }
}
