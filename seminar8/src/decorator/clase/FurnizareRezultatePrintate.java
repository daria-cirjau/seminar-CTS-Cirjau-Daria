package decorator.clase;

public class FurnizareRezultatePrintate implements FurnizareRezultate{
    @Override
    public void printeazaRezultate(String diagnostic) {
        System.out.println("Rezultat printat pe hartie. Diagnosticul pacientului este " + diagnostic);
    }
}
