import java.util.Scanner;

public class ifelsecont {
    public static void main(String args[]){
        int leapyr;
        Scanner s = new Scanner(System.in);
        leapyr = s.nextInt();
        if(((leapyr%4==0)&&(leapyr%100!=0))||(leapyr%400==0)){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
    }
}
