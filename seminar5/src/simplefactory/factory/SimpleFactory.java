package simplefactory.factory;

import simplefactory.classes.*;

public class SimpleFactory {
    public static PersonalSpital createPersonal(TipPersonal tipPersonal, String nume) {
        switch (tipPersonal) {
            case MEDIC -> {
                return new Medic(nume);
            }
            case BRANCARDIER -> {
                return new Brancardier(nume);
            }
            case ASISTENT -> {
                return new Asistent(nume);
            }
        }
        return null;
    }

    public static PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int vechime) {
        switch (tipPersonal) {
            case ANESTEZIST -> {
                return new Anestezist(nume, vechime);
            }
            default -> {
                return createPersonal(tipPersonal, nume);
            }
        }
    }
}
