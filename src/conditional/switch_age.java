package conditional;

import java.util.Scanner;

public class switch_age {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        switch (age) {
            case 19 -> System.out.println("not adult");
            case 23 -> System.out.println("adult");
            case 30 -> System.out.println("aksnck");
            default -> System.out.println("enjoy tour life");
        }
    }
}
