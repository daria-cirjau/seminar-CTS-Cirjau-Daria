package simplefactory.main;

import simplefactory.classes.PersonalSpital;
import simplefactory.factory.SimpleFactory;
import simplefactory.classes.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PersonalSpital> personalSpitalList = new ArrayList<>();
        PersonalSpital medic = SimpleFactory.createPersonal(TipPersonal.MEDIC, "Medic1");
        PersonalSpital brancardier = SimpleFactory.createPersonal(TipPersonal.BRANCARDIER, "Brancardier");
        PersonalSpital asistent = SimpleFactory.createPersonal(TipPersonal.ASISTENT, "Asistent");
        PersonalSpital anestezist = SimpleFactory.createPersonal(TipPersonal.ANESTEZIST, "Anestezist", 15);

        personalSpitalList.addAll(List.of(medic, brancardier, asistent, anestezist));
    }
}
