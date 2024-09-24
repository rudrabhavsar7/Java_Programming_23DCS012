import java.io.*;
import java.util.*;

public class prec27 {
    public static void main(String[] args) {
        int length = args.length;
        int count = 0;

        if(args.length==0)
        {
            System.out.println("Specify Input");
            
        }

        for (int i = 0; i < length; i++) {
            
            String fname = args[i];
            
            File f = new File(fname);
            count=0;

            try {
                if (f.createNewFile()) {
                    System.out.println("File Created");
                } else {
                    System.out.println("Already");
                }
                Scanner scan = new Scanner(f);
                while (scan.hasNextLine()) {
                    String temp = scan.nextLine();
                    System.out.println(temp);
                    count++;
                }
                scan.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Count  = " + count);
        }

    }
}
