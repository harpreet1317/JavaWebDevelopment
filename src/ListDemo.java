
import java.util.ArrayList;

import java.util.*;

public class ListDemo{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> cars=new ArrayList<String>(100);
       System.out.println("Enter the size of the arraylist: ");
       int size=sc.nextInt();

        for (int i=0;i<size;i++)
        {
            System.out.println("Enter the" +i + "car");
            cars.add(sc.next());
        }
        for (String i:cars)
        {
            System.out.println(i);
        }
    }
}