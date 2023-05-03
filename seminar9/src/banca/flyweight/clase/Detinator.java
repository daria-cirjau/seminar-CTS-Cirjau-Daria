package banca.flyweight.clase;

public class Detinator implements ClientBanca {
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Detinator(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public void descriere(ContBancar contBancar) {
        System.out.println(this.toString() + " " + contBancar.toString());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaMail='").append(adresaMail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
