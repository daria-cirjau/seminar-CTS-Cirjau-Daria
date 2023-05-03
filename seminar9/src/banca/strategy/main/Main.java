package banca.strategy.main;

import banca.strategy.clase.Operator;
import banca.strategy.clase.VerificareClientPF;
import banca.strategy.clase.VerificareClientPJ;

public class Main {
    public static void main(String[] args) {
        Operator operator1 = new Operator();
        operator1.verificaClient();
        operator1.setModVerificare(new VerificareClientPJ());
        operator1.verificaClient();
        operator1.setModVerificare(new VerificareClientPF());
        operator1.verificaClient();
    }
}
