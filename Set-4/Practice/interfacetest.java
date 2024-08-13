interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default MEthod");
    }
}

class MyClass implements MyInterface {
    public void abstractMethod() {
        System.out.println("Abstract");
    }

    public void defaultMethod()
    {
        MyInterface.super.defaultMethod();
        System.out.println("override");
    }

}public class interfacetest{

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod();
        obj.defaultMethod();
    
    }

}
