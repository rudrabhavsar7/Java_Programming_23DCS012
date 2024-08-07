class Test1 {
    void display(){
        System.out.println("Hello");
    }
}

public class checkedexception {
    public static void main(String[] args) {
       try{
        Class.forName("Test2");
       }
       catch(ClassNotFoundException e){
        System.out.println(e.toString());
       }
        Test1 t1 = new Test1();
        t1.display();
    }

}
