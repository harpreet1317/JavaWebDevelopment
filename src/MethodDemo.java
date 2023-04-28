import java.util.Scanner;
public class MethodDemo {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("Enter a");
        int a = src.nextInt();
        System.out.println("Enter b");
        int b = src.nextInt();
        String s = doSum(a, b);
        System.out.println("Result is " + s);
    
    }

    static String doSum(int a, int b) {
        int sum = a + b;
        String message;
        if (sum % 2 == 0) {
            message = "Sum is even number";
        } else
        {
            message = "The sum is odd number";
        }
        return (message);
    }
}
