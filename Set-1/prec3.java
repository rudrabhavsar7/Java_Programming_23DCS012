
import java.util.*;

public class prec3 {

    public static void main(String[] args) {
        float time[] = new float[3];
        Scanner s = new Scanner(System.in);
        int choice;
        float dis, tmin, tsec, thour;
        float calculate;

        System.out.print("Enter Distance : ");
        dis = s.nextFloat();

        System.out.print("Enter Time In Hours : ");
        time[0] = s.nextFloat();
        System.out.print("Enter Time In Min : ");
        time[1] = s.nextFloat();
        System.out.print("Enter Time In Sec : ");
        time[2] = s.nextFloat();

        tmin = (time[0] * 60);
        tsec = ((tmin + time[1]) * 60) + time[2];
        thour = time[0] + (time[1] / 60) + (time[2] / 3600);

        System.out.println("Choose Unit To Display Velocity");
        System.out.println("1.m/s");
        System.out.println("2.km/h");
        System.out.println("3.miles/h");
        choice = s.nextInt();
        switch (choice) {
            case 1:

                calculate = dis / tsec;
                System.out.println("Velocity = " + calculate + " m/s");
                break;

            case 2:
                dis = dis / 1000;
                calculate = dis / thour;
                System.out.println("Velocity = " + calculate + " km/h");
                break;

            case 3:
                dis = dis / 1609;
                calculate = dis / thour;
                System.out.println("Velocity = " + calculate + " miles/h");
                break;
        }

    }
}
