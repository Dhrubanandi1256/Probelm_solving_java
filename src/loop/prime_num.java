//package loop;
//
//import java.util.Scanner;
//
//public class prime_num {
//    public static void main(String[]args) {
//        System.out.println("enter a number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 2; i < n; i++) {
//            if (n % i ==0) {
//                System.out.println("this is not prime number");
//
//            } else {
//                System.out.println(" prime");
//            }
//        }
//    }
//}
package loop;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }}
            if (!flag) {
                System.out.println("prime num");
            } else {
                System.out.println("not prime");
            }
        }
    }

