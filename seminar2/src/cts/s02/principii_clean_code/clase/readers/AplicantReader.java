package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.util.List;

public interface AplicantReader {
    List<Aplicant> readAplicant(String fileName);
}
