package restaurant.templatemethod.clase;

public class Masa extends IMasa{

    public Masa(int nr) {
        super(nr);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Am curatat masa " + super.getNr());
    }

    @Override
    protected void aseazaMasa() {
        System.out.println("Am asezat masa " + super.getNr());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Am asezat servetelele pt masa " + super.getNr());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Am asezat tacamurile pt masa " + super.getNr());
    }

    @Override
    protected void invitaClienti() {
        System.out.println("Am invitat clientii pt masa " + super.getNr());
    }
}
