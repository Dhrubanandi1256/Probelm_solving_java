package conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switch_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch (button){
            case 1:
            System.out.println("hello world");
            break;
            case 2:
                System.out.println("ana");
                break;
            case 3:
                System.out.println("asjkjs");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
