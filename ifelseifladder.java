import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class ifelseifladder {
    public static void main(String args[]){
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if (marks<33){
            System.out.println("fail");
        }
        else if(marks>=33&&marks<=50){
            System.out.println("C grade");
        }
        else if(marks>50&&marks<=75){
            System.out.println("B grade");
        }
        else if(marks>75&&marks<=85){
            System.out.println("A grade");
        }
        else if(marks>85&&marks<=100){
            System.out.println("A+ grade");
        }
        else {
            System.out.println("Not valide");
        }
    }
}
