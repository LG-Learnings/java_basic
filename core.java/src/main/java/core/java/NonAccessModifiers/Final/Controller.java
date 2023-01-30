package core.java.NonAccessModifiers.Final;

public class Controller {
    private final String name = "Mbhiki";
    private String surname = "Mashoba";
    private static int age = 2;

    public static void main(String[] arg){
        Controller controller = new Controller();  //create object to access non-static variables in a static class
       // controller.name = "Olwam";   error: Cannot assign a value to final variable 'name'

        controller.surname = "Gxogxa";  //No error because its not a final variable but needs an object to access it

        age = 3; //can be access without creating object because its static variable

        controller.nonStaticMethod(); //needs an object to access it
    }

    public void nonStaticMethod(){
        //No need to create objects
      //  name = "Olwam"; //error: Cannot assign a value to final variable 'name'

        surname = "Gxogxa"; //can be access without creating object
        age = 3; //can be access without creating object

        System.out.println(name+" "+surname+" "+age);
    }
}
