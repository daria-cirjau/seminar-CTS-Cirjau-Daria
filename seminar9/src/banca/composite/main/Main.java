package banca.composite.main;

import banca.composite.clase.Agentie;
import banca.composite.clase.Filiala;
import banca.composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara agentie1 = new Agentie(30, "Agentie1");
        UnitateBancara agentie2 = new Agentie(15, "Agentie2");
        UnitateBancara sucursala1 = new Agentie(35, "Sucursala1");
        UnitateBancara sucursala2 = new Agentie(105, "Sucursala2");
        UnitateBancara filiala1 = new Filiala(5, "Filiala1");
        UnitateBancara filiala2 = new Filiala(7, "Filiala2");
        UnitateBancara filiala3 = new Filiala(10, "Filiala3");

        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(filiala1);
        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);
        sucursala2.adaugaUnitate(filiala3);

        sucursala1.printeazaDescreiere("   ");
    }
}
