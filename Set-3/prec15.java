class area {

    int length, breadth;

    area() {
    }

    area(int len, int brth) {
        length=len;
        breadth=brth;
    }

    int getarea()
    {
        return length*breadth;
    }

}

public class prec15 {
    public static void main(String[] args) {

        area a1=new area(50, 20);
        area a2=new area();

        System.out.println("Area : "+ a1.getarea());
        System.out.println("Area 2 : " + a2.getarea());
    }
}
