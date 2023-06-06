package conditional;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_game {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        //2 for scissor

        Scanner sc =new Scanner(System.in);
        int userinput= sc.nextInt();
        int number;
        Random random=new Random();
        number= random.nextInt(3);
       // System.out.println("generated number:"+number);
        if(userinput==0){
            System.out.println("rock");
        }
        if(userinput==1){
            System.out.println("paper");
        }
        if(userinput==0){
            System.out.println("scissor");
        }

        if(number==0){
            System.out.println("Rock");
        }
        else if(number==1){
            System.out.println("paper");

        }
        else {
            System.out.println("scissor");
        }
        if(number==userinput){
            System.out.println(" no-one win");
        }
        else if (userinput==0&&number==2 || userinput==1 && number==0 ||userinput==2 && number==1){
            System.out.println("you will  win");
        }
        else {
            System.out.println("pc will win");
        }
    }
}
