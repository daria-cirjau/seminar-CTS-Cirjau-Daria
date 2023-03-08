package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicants(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",|\n");
            List<Aplicant> elevi = new ArrayList<>();

            while (scanner.hasNext()) {
                Elev e = new Elev();
                super.readAplicant(scanner, e);
                int clasa = scanner.nextInt();
                String tutore = scanner.next();
                e.setClasa(clasa);
                e.setTutore(tutore);
                elevi.add(e);
            }
            scanner.close();
            return elevi;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
