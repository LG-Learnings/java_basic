package core.java.OPP.Inheritence.SuperController;

//The super keyword can also be used to invoke parent class method.
// It should be used if subclass contains the same method as parent class.
// In other words, it is used if method is overridden.

class AnimalM{
    void eat(){System.out.println("eating...");}
    public void sound(){System.out.println("Sound...");}
}
class DogM extends AnimalM{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}

    void work(){
        super.eat();
        bark();
        System.out.println();
    }
}

class CowM extends AnimalM{
    @Override
    public void sound() {
        System.out.println("Bow Bow ....");
    }
    public void print(){
        sound();
        super.sound();
    }
}
class TestSuper2{
    public static void main(String args[]){
        DogM d=new DogM();
        d.work();

        System.out.println("Override:");
        CowM cowM=new CowM();
        cowM.print();
    }}
