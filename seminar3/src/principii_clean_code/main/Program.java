package principii_clean_code.main;


import principii_clean_code.clase.Angajat;
import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.readers.AngajatReader;
import principii_clean_code.clase.readers.AplicantReader;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        AplicantReader aplicantReader = new AngajatReader();
        listaAplicanti = aplicantReader.readAplicants("angajati.txt"); //TODO nume fisier in constructor APlicantReader (o facem cls abstracta)
        for (Aplicant aplicant : listaAplicanti) {
            System.out.println(aplicant.toString());
            aplicant.afisareSumaFinantare();
        }
    }

}
