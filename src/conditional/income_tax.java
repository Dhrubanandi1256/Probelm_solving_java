package conditional;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Income Salary");
        float income = sc.nextFloat();
        float tax=sc.nextFloat();
        if (income < 2.5) {
            System.out.println("no tax needed");
        } else if (income >= 2.5f && income < 5.0f) {
            System.out.println("5%tax");
            tax =tax+0.05f * (income-2.5f);
        } else if (income >= 5.0f && income< 10f) {
           tax=tax+ 0.05f * (5.8f-2.5f);
        } else {
            System.out.println("30% tax");
        }
    }
}