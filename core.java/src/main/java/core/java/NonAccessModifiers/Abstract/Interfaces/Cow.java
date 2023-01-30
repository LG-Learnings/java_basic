package core.java.NonAccessModifiers.Abstract.Interfaces;

import org.springframework.stereotype.Service;

@Service
public class Cow implements Animal{

    @Override
    public String animalSound() {
        return "Mooo";
    }

    @Override
    public String sleep() {
        return "mZzz";
    }
}
