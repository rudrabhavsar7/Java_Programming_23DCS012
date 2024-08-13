
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int i,sum=0;
        for(i = 1 ;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}

public class prec22 {
    public static void main(String[] args) {
        int result,n;
        MyCalculator obj = new MyCalculator();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number : ");
        n=scan.nextInt();
        scan.close();
        result=obj.divisor_sum(n);
        System.out.println("Divisor Sum : " + result);
        
    }
}
