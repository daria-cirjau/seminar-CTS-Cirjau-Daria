package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader implements AplicantReader {

    @Override
    public List<Aplicant> readAplicant(String fileName) {
        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));
            input.useDelimiter(",|\n");
            List<Aplicant> studenti = new ArrayList<>();

            while (input.hasNext()) {
                String nume = input.next();
                String prenume = (input.next()).toString();
                int varsta = input.nextInt();
                int punctaj = input.nextInt();
                int nr = input.nextInt();
                String[] vect = new String[5];
                for (int i = 0; i < nr; i++)
                    vect[i] = input.next();
                int an_studii = input.nextInt();
                String facultate = (input.next()).toString();
                Student s = new Student(input.next(), input.next(), input.nextInt(), input.nextInt(), nr, vect, facultate, an_studii);
                studenti.add(s);
            }
            input.close();
            return studenti;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
