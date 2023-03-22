package factorymethod.main;

import factorymethod.classes.Medic;
import factorymethod.classes.PersonalSpital;
import factorymethod.factory.BrancardierFactory;
import factorymethod.factory.MedicFactory;

public class Main {
    public static void main(String[] args) {
        MedicFactory factoryMedic = new MedicFactory();
        BrancardierFactory brancardierFactory = new BrancardierFactory();

        PersonalSpital medic1 = factoryMedic.createPersonal("Medic1");
        PersonalSpital medic2 = factoryMedic.createPersonal("Medic2");
        PersonalSpital brancardier = factoryMedic.createPersonal("Brancardier1");
    }
}
