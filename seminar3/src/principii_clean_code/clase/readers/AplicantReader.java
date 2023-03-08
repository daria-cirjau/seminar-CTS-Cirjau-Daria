package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;

import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicants(String fileName);

    public void readAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int numarProiecte = scanner.nextInt();
        String[] denumiriProiecte = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setProiecte(numarProiecte, denumiriProiecte);
    }
}
