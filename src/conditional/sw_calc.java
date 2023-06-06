package conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sw_calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        System.out.println("enter a symbol(+,-,*,/)");
        String sym= sc.next();


         int res=switch (sym)
        {
            case "+"->a+b;
            case"-"->a-b;
            case"*"->a*b;
            case"/"->a/b;
            default -> 0;


        };
        System.out.println(res);





    }


}
