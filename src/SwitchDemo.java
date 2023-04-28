import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args){

     String username;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter username");
     username=sc.next();

      switch (username)
        {
            case "Tom123":
                System.out.println("Password is TomPassword123");
                break;
            case "Peter123":
                System.out.println("Password is PeterPassword123");
                break;
            case "Sam123":
                System.out.println("Password is SamPassword123");

            default:
                System.out.println("Wrong username");
        }
    }
    }

