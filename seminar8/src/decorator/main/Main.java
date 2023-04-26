package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.FurnizareRezultatOnline;
import decorator.clase.FurnizareRezultate;
import decorator.clase.FurnizareRezultatePrintate;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultate furnizareRezultatePeHartie = new FurnizareRezultatePrintate();
        furnizareRezultatePeHartie.printeazaRezultate("Diagnostic 1");
        DecoratorAbstract decorator = new FurnizareRezultatOnline(furnizareRezultatePeHartie);
        decorator.printeazaRezultate("Diagnostic 2");
        decorator.posteazaRezultateOnline("Diagnostic 3");
    }
}
