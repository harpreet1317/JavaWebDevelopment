
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
       int[] a= new int[5];
       int[] b=new int[5];
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
       for(int i=0 ; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
      //  System.out.println("Enter the integer to find in array");
     int i=0;
       for(int temp: a)
     {
         b[i]=temp;
     }
        System.out.println("Elements of array b are");
        for(i=0 ; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
       }
    }

