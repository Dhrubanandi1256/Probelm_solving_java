package conditional;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a website");
        String website =sc.next();
        if(website.endsWith(".org")){
            System.out.println("organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("indian");
        }
    }
}
