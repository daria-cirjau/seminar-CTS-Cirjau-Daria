package decorator.clase;

public class FurnizareRezultatOnline extends DecoratorAbstract {
    public FurnizareRezultatOnline(FurnizareRezultate furnizareRezultateProdusAbstract) {
        super(furnizareRezultateProdusAbstract);
    }

    @Override
    public void printeazaRezultate(String diagnostic) {
        super.furnizareRezultateProdusAbstract.printeazaRezultate(diagnostic);
    }

    @Override
    public void posteazaRezultateOnline(String diagnostic) {
        System.out.println("Rezultat postat online. Diagnosticul pacientului este " + diagnostic);
    }
}
