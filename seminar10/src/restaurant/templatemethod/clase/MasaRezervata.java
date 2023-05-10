package restaurant.templatemethod.clase;

public class MasaRezervata extends IMasa {
    private String oraRezervarii;

    public MasaRezervata(int nr, String oraRezervarii) {
        super(nr);
        this.oraRezervarii = oraRezervarii;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Curata masa " + super.getNr() + " inainte de ora " + oraRezervarii);
    }

    @Override
    protected void aseazaMasa() {
        System.out.println("Aseaza masa " + super.getNr() + " inainte de ora " + oraRezervarii);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Aseaza servetelele pt masa " + super.getNr() + " inainte de ora " + oraRezervarii);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Aseaza tacamurile pt masa " + super.getNr() + " inainte de ora " + oraRezervarii);
    }

    @Override
    protected void invitaClienti() {
        System.out.println("Invita clientii " + super.getNr() + " la ora " + oraRezervarii);
    }
}
