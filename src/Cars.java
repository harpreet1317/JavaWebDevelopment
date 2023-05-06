import java.util.Scanner;

public class Cars {
    String carName;
    int year;

    Cars(String carName, int year) {
        this.carName = carName;
        this.year = year;
    }

    public String drive() {
        return "I am driving " + carName +" " + year;
    }

    public static void main(String[] args) {
        Cars car1 = new Cars("BMW", 2002);
        Cars car2 = new Cars("Honda", 2002);
        Cars car3 = new Cars("Toyota", 2002);

        System.out.println("Enter a number to select a car");
        System.out.println("1.BMW");
        System.out.println("2.Honda");
        System.out.println("3.Toyota");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(car1.drive());
                break;
            case 2:
                System.out.println(car2.drive());
                break;
            case 3:
                System.out.println(car3.drive());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
