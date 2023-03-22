package factorymethod.factory;


import factorymethod.classes.Asistent;
import factorymethod.classes.PersonalSpital;

public class AsistentFactory implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}
