package loop;

public class fibonacci {
    public  static void  main (String[]args){
        int a=0 ,b=1,c ;
        for(int i=1;i<=5;i++){
            c=a+b;
            System.out.print(a);
         //jodi 1 theke shuru korte chai
            // System.out.print(c);
            if (i <5) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
            a=b;
            b=c;

        }

    }
}
