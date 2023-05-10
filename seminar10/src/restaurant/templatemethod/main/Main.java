package restaurant.templatemethod.main;

import restaurant.templatemethod.clase.IMasa;
import restaurant.templatemethod.clase.Masa;
import restaurant.templatemethod.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        IMasa masa1 = new Masa(1);
        masa1.ocupaMasa();
        IMasa masa2 = new MasaRezervata(2, "14:30");
        masa2.ocupaMasa();
    }
}
