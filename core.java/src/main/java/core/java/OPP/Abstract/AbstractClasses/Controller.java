package core.java.OPP.Abstract.AbstractClasses;

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

        Cow cow = new Cow();
        cow.animalSound();
        cow.sleep();


    }
}
