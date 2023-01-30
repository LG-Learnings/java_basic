package core.java.OPP.Inheritence.SuperController;

//We can use super keyword to access the data member or field of parent class.
// It is used if parent class and child class have same fields.

class Animal{
    String color="white";
}

class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

class Cow extends Animal{
    String color="Brown";

    void printColor(){
        super.color = color;  //Override the color from super class
        System.out.println(super.color);//prints color of Animal class
    }
}

class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();

        Cow cow=new Cow();
        cow.printColor();
    }}