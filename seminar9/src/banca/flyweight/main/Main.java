package banca.flyweight.main;

import banca.flyweight.clase.ContBancar;
import banca.flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        ContBancar contBancar1 = new ContBancar(300f, 12);
        ContBancar contBancar2 = new ContBancar(1200f, 8);
        ContBancar contBancar3 = new ContBancar(39300f, 11);

        flyweightFactory.getDetinator("Detinator1", "00000000", "a@a")
                .descriere(contBancar1);
        flyweightFactory.getDetinator("Detinator2", "0101100202", "aa@a")
                .descriere(contBancar2);
        flyweightFactory.getDetinator("Detinator2", "0101100202", "aa@a")
                .descriere(contBancar3);
        flyweightFactory.getDetinator("Detinator1", "00000000", "a@a")
                .descriere(contBancar2);
    }
}
