package core.java.OPP.Abstract.Interfaces;

import org.springframework.stereotype.Service;
@Service
public class Pig implements Animal {

    public String animalSound(){
        return "Rhooo";
    }

    @Override
    public String sleep() {
        return "rZzzzz";
    }
}
