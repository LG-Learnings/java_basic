package core.java.OPP.Encapsulation;

public class Controller {

    public static void main(String[] arg){

        Person person = new Person();
        person.setName("Olwam");
        person.setLastName("Gxogxa");
        person.setAge(2);

        System.out.println(person.getName()+" "+person.getLastName()+" "+person.getAge());

    }
}
