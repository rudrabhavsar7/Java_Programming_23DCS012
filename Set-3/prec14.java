
import java.util.Scanner;

class date {
    int date, month, year;
    Scanner s = new Scanner(System.in);

    date() {
    }

    date(int dt, int m, int ye) {
        date = dt;
        month = m;
        year = ye;
    }

    void setdate() {
        System.out.println("Enter Date : ");
        date = s.nextInt();
    }

    void setmonth() {
        System.out.println("Enter Month : ");
        month = s.nextInt();
    }

    void setyear() {
        System.out.println("Enter Year : ");
        year = s.nextInt();
    }

    void putdate() {
        System.out.println(date + "/" + month + "/" + year);
    }

}

public class prec14 {
    public static void main(String[] args) {

        date d1 = new date();

        d1.setdate();
        d1.setmonth();
        d1.setyear();
        d1.putdate();

    }
}
