//Write a program to find out whether a student is pass or fail.
// If it requires total of 40% and at least 33% in each subject to pass .
// Assume 3 subjects and take marks as input from user

package conditional;

import java.util.Scanner;

public class pass_fail_conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first subject marks");
        int marks1 = sc.nextInt();
        System.out.println("enter second subject marks");
        int marks2=sc.nextInt();
        System.out.println("enter third subject marks");
        int marks3=sc.nextInt();
        float avg=(marks3+marks2+marks1)/3.0f;
        System.out.println("avg is " +avg);

        if(avg>=40 && marks1>=33 && marks2>= 33 && marks3>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }
}
