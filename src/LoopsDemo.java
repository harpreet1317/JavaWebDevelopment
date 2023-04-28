import java.util.Scanner;
public class LoopsDemo {

    public static void main(String[] args) {

        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to use calculator");
        boolean flag = true;
        System.out.println("** Let us do some Maths **");
        while(flag) {
            System.out.println("\n **Enter the Operation you want to Perform**");
            System.out.println("1 .Sum\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer a");
                    a = sc.nextInt();
                    System.out.println("Enter integer b");
                    b = sc.nextInt();
                    System.out.println("Sum of " + a + "and " + b + " is :" + (a + b));
                    break;
                case 2:
                    System.out.println("Enter integer a");
                    a = sc.nextInt();
                    System.out.println("Enter integer b");
                    b = sc.nextInt();
                    System.out.println("Difference of " + a + "and " + b + " is :" + (a - b));
                    break;
                case 3:
                    System.out.println("Enter integer a");
                    a = sc.nextInt();
                    System.out.println("Enter integer b");
                    b = sc.nextInt();
                    System.out.println("Multiplication of " + a + "and " + b + " is :" + (a * b));
                    break;
                case 4:
                    System.out.println("Enter integer a");
                    a = sc.nextInt();
                    System.out.println("Enter integer b");
                    b = sc.nextInt();
                    System.out.println("Division of " + a + "and " + b + " is :" + (a / b));
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Enter the correct value");
                    break;
            }
        }
        System.out.println("Hope you enjoyed\nCome Again");
    }

}