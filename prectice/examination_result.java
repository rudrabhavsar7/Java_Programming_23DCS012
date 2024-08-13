import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    Scanner scan = new Scanner(System.in);

    public void getdata() {
        System.out.print("\nEnter Name : ");
        name = scan.nextLine();
        System.out.print("\nEnter Roll Number : ");
        rollNumber = scan.nextInt();

    }

    public void putdata() {
        System.out.print("\nName : " + name);
        System.out.print("\nRoll No : " + rollNumber);
    }

}

class Exam extends Student {
    int marks[] = new int[6];

    public void getdata() {
        super.getdata();
        for (int i = 0; i < 6; i++) {
            System.out.print("\nEnter Subject " + (i + 1) + " Mark Out Of 50 : ");
            marks[i] = scan.nextInt();
        }
    }

}

class result extends Exam {
    int total_marks = 0;

    void total_marks() {
        super.putdata();
        for (int i = 0; i < 6; i++) {
            total_marks += marks[i];
        }
        System.out.println("\nTotal Marks : " + total_marks);

    }

}

public class examination_result {
    public static void main(String[] args) {

        result r1 = new result();

        r1.getdata();
        r1.total_marks();

    }
}
