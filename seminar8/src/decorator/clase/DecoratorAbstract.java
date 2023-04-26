package decorator.clase;

public abstract class DecoratorAbstract implements FurnizareRezultate{
    FurnizareRezultate furnizareRezultateProdusAbstract;

    public DecoratorAbstract(FurnizareRezultate furnizareRezultateProdusAbstract) {
        this.furnizareRezultateProdusAbstract = furnizareRezultateProdusAbstract;
    }

    public abstract void posteazaRezultateOnline(String diagnostic);
}
