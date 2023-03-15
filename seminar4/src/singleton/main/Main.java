package singleton.main;

import singleton.classes.BazaDeDate;
import singleton.classes.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstanta(2013, 5); //id ul este acelasi pt ambele obj
        Secretariat secretariat2 = Secretariat.getInstanta(2015, 7);

        System.out.println(secretariat1);
        System.out.println(secretariat2);

        BazaDeDate bazaDeDate1 = BazaDeDate.getInstance();
        BazaDeDate bazaDeDate2 = BazaDeDate.getInstance();
        bazaDeDate1.setDimensiuneDate(150);
        bazaDeDate1.setDeumire("BD1.1");
        bazaDeDate2.setDimensiuneDate(200);
        bazaDeDate2.setDeumire("BD2");

        System.out.println(bazaDeDate1);
        System.out.println(bazaDeDate2);
    }
}
