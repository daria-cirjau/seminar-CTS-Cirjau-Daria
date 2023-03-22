package factorymethod.factory;


import factorymethod.classes.Brancardier;
import factorymethod.classes.PersonalSpital;

public class BrancardierFactory implements Factory {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}
