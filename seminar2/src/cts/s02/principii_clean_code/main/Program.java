package cts.s02.principii_clean_code.main;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        AplicantReader aplicantReader = new AngajatReader();
        listaAplicanti = aplicantReader.readAplicant("angajati.txt"); //TODO nume fisier in constructor APlicantReader (o facem cls abstracta)
        for (Aplicant angajat : listaAplicanti)
            System.out.println(angajat.toString());
    }

}
