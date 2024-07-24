import java.util.*;

public class prec6{
    public static void main(String[] args) {

        int i,n;
        long sum=0,ref1=0,ref2=1,temp;
        System.out.println("Enter Total No Of Fibbonaci Value");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        System.out.println(ref1 + "\n" + ref2);
        for(i=1;i<=n;i++)
        {
            temp=ref1+ref2;
            ref1=ref2;
            ref2=temp;

            System.out.println(temp);
            sum+=temp;
        }   

        System.out.println("Sum = " + sum );
    }
}
