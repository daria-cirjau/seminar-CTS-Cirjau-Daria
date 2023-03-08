package principii_clean_code.clase.readers;


import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    @Override
    public List<Aplicant> readAplicants(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",|\n");
            List<Aplicant> studenti = new ArrayList<>();

            while (scanner.hasNext()) {
                Student s = new Student();
                super.readAplicant(scanner, s);
                int anStudii = scanner.nextInt();
                String facultate = (scanner.next()).toString();
                s.setAnStudii(anStudii);
                s.setFacultate(facultate);
                studenti.add(s);
            }
            scanner.close();
            return studenti;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
