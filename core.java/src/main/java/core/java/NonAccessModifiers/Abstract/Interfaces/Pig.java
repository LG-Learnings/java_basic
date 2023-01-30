package core.java.NonAccessModifiers.Abstract.Interfaces;

import org.springframework.stereotype.Service;
@Service
public class Pig implements Animal{

    public String animalSound(){
        return "Rhooo";
    }

    @Override
    public String sleep() {
        return "rZzzzz";
    }
}
