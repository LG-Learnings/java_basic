package core.java.NonAccessModifiers.Abstract.AbstractClasses;

public class Controller {

    public static void main(String[] arg){

        //you can axcess the abstract class like below and override the abstract methods
        Animal animal = new Animal() {
            @Override
            public void animalSound() {
                System.out.println("Mooo");
            }
        };
        animal.animalSound();
        animal.sleep();

        System.out.println();
        // axcess the abstract class through its sub class.
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();


    }
}
