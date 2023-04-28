import java.util.Scanner;
public class IfElseDemo {
    public static void main(String[] args) {
        int a;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Number");
        a=src.nextInt();

        if(a>10)
            {
                System.out.println("Number %d is greater than 10");
            }
        else if(a>0)
            {
                System.out.println("Number is positive");
            }
        else if(a==0)
            {
                System.out.println("Number is equal to 0");
            }
        else if(a<0)
            {
                System.out.println("Integer is negative");
            }


    }
}
