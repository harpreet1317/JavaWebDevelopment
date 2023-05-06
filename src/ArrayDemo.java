import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {

        /*int m,n,i,j;
        //int[][] a=new int[m][n];
        //int m,n,i,j;
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number of rows");
        m=sc.nextInt();
        System.out.println("Enter the number of columns");
        n=sc.nextInt();
        int[][] a=new int[m][n];
           System.out.println("Enter the values");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.print("The values you enetered are :");
        for (i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
        System.out.println(a[i][j]+ " ");
            System.out.println(" ");
        }

        //System.out.println("Input array:" +array[i]);

    }
   public static int findMin(int[] arr) {
        int minVal = arr[0]; // initialize minVal to the first element of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i]; // update minVal if we find a smaller value
            }
        }
        return minVal;
    */
               /* int rows = 5;

                for(int i=rows; i>=1; i--) {
                    for(int j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }*/
        int[] orderPrice = new int[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<orderPrice.length;i++) {

            if ((i == 4) || (i == 5) || (i == 8) || (i == 9)) {
                System.out.println("Enter th value for "+i +" location");
                orderPrice[i] = sc.nextInt();
            }
        }
       /* orderPrice[2] = 5;
        orderPrice[5] = 8;
        orderPrice[6] = 4;
        orderPrice[9] = 9;*/

        for (int i = 0; i < orderPrice.length; i++) {

            System.out.println(orderPrice[i]);
        }
    }
}

