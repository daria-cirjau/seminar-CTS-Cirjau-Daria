package principii_clean_code.clase.readers;

import principii_clean_code.clase.Angajat;
import principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicants(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",");
            List<Aplicant> angajati = new ArrayList<>();
            while (scanner.hasNext()) {
                Angajat a = new Angajat();
                readAplicant(scanner, a);
                int salariu = scanner.nextInt();
                String ocupatie = scanner.next();
                a.setSalariu(salariu);
                a.setOcupatie(ocupatie);
                angajati.add(a);
            }
            scanner.close();
            return angajati;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
