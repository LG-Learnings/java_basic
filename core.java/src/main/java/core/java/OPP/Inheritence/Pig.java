package core.java.OPP.Inheritence;

public class Pig extends Animal{
    private String color = "White";
    private String maleOrFemale = "Female";

    public void print(){
        System.out.println("Super class color: "+super.color);
        System.out.println("Pig color: "+color);
        System.out.println("Pig gender: "+maleOrFemale);

        System.out.println("Overriding super class color");
        super.color = color;
        System.out.println("Super class color: "+super.color);
        System.out.println("Pig color: "+color);

        super.animalSound();
        super.animalSleep();

  }
}
