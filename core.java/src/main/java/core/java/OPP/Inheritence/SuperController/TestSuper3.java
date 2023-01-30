package core.java.OPP.Inheritence.SuperController;

//The super keyword can also be used to invoke the parent class constructor

class AnimalC{
    AnimalC(){
        System.out.println("animal is created");
    }
}
class DogC extends AnimalC{
    DogC(){
        super();
        System.out.println("dog is created");
    }
}
class TestSuper3{
    public static void main(String args[]){
        DogC d=new DogC();
    }}
