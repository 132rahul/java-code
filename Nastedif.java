import java.util.Scanner;

public class Nastedif {
    public static void main(String args[]){
        int age;
        Scanner sc =new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18){
            if(age<=51){
                System.out.println("Yes donate blood");
            }
            else
                System.out.println("Not vaid age");
        }
        else
            System.out.println("Not vaid age");
    }
}
