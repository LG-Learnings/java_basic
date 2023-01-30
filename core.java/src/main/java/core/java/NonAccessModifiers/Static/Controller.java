package core.java.NonAccessModifiers.Static;
/*
A static method means that it can be accessed without creating an object of the class, unlike public
 */
public class Controller {

    public static void main(String[] args){
        /*no need to create object of the class to access static methods in another static method,
         but you have to create it for non-static methods if you want to access them on a static class*/
        TestMethods.publicStaticMethod();
        TestMethods.staticMethod();
        Controller controller = new Controller();
        controller.publicMethod();

        /*You have to create object of the class to access both static methods and public methods
        in another static method.*/
        TestMethods testMethods = new TestMethods();
        TestMethods.publicStaticMethod();
        TestMethods.staticMethod();
        testMethods.publicMethod();

    }

    public static void publicStaticMethod(){
        System.out.println("I am publicStaticMethod");
    }

    static void staticMethod(){
        System.out.println("I am staticMethod");
    }

    public void publicMethod(){
        System.out.println("I am publicMethod");
    }
}
