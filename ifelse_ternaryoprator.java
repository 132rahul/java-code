import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class ifelse_ternaryoprator {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String output=(num%2==0)?"even Number":"odd Number";
        System.out.println(output);
    }
}
