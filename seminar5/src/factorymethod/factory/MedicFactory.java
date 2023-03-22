package factorymethod.factory;


import factorymethod.classes.Medic;
import factorymethod.classes.PersonalSpital;

public class MedicFactory implements Factory{

    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
