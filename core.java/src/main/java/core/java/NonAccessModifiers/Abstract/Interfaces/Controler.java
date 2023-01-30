package core.java.NonAccessModifiers.Abstract.Interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public class Controler {

    public static void main(String[] arg){

        Animal animal = new Animal() {
            @Override
            public String animalSound() {
                return "Howw";
            }

            @Override
            public String sleep() {
                return "hZzzz";
            }
        };

        System.out.println(animal.animalSound());
        System.out.println(animal.sleep());

        Pig pig = new Pig();
        System.out.println(pig.animalSound());
        System.out.println(pig.sleep());

        Cow cow = new Cow();
        System.out.println(cow.animalSound());
        System.out.println(cow.sleep());
    }
}
