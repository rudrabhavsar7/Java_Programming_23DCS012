
import java.util.Scanner;

public class prec4 {
    public static void main(String[] args) {
        
        int i;
        float sum=0;
        float arr[]=new float[5];

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Expenses : ");
        for(i=0;i<5;i++)
        {
            arr[i]=s.nextFloat();
            sum+=arr[i];
        }
        System.out.println("Total Expense = " + sum);
    }
}
