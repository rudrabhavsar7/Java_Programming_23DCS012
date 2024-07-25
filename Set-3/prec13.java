
import java.util.Scanner;

class employee {
    String fn, ln;
    double salary;
    Scanner s = new Scanner(System.in);

    employee() {
    }
    
    employee(String f, String l, double sl) {
        fn = f;
        ln = l;
        salary = sl;
    }

    void setfirstname()
    {
        System.out.println("Enter Employee's First Name : ");
        fn=s.nextLine();
    }

    void setlastname()
    {
        System.out.println("Enter Employee's Last Name : ");
        ln=s.nextLine();
    }

    void setsalary()
    {
        System.out.println("Enter Employee's Salary : ");
        salary=s.nextDouble();
        if(salary<0)
        {
            salary=0;
        }
    }

    String getfirstname()
    {
        return fn;
    }
    String getlastname()
    {
        return ln;
    }
    double getsalary()
    {
        return salary;
    }

}

public class prec13 {
    public static void main(String[] args) {

        employee e1=new employee();
        employee e2=new employee();

        e1.setfirstname();
        e1.setlastname();
        e1.setsalary();

        System.out.println("First Name : " + e1.getfirstname());
        System.out.println("Last Name : " + e1.getlastname());
        System.out.println("Salary : " + e1.getsalary());
        System.out.println("New Salary : " + (e1.getsalary()+(e1.getsalary()*0.1)));

        System.out.println("-------------------------------------------------------------------------");

        e2.setfirstname();
        e2.setlastname();
        e2.setsalary();

        System.out.println("First Name : " + e2.getfirstname());
        System.out.println("Last Name : " + e2.getlastname());
        System.out.println("Salary : " + e2.getsalary());
        System.out.println("New Salary : " + (e2.getsalary()+(e2.getsalary()*0.1)));

    }
}
