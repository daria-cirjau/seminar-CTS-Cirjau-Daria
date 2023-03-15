package singleton.classes;

public class BazaDeDate {
    private int dimensiuneDate;
    private int numarTabele;
    private String deumire;
    private static BazaDeDate instanta = new BazaDeDate(100, 20, "BD1");

    private BazaDeDate(int dimensiuneDate, int numarTabele, String deumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.deumire = deumire;
    }

    public static BazaDeDate getInstance(){
        return BazaDeDate.instanta;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    public void setNumarTabele(int numarTabele) {
        this.numarTabele = numarTabele;
    }

    public void setDeumire(String deumire) {
        this.deumire = deumire;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDeDate{");
        sb.append("dimensiuneDate=").append(dimensiuneDate);
        sb.append(", numarTabele=").append(numarTabele);
        sb.append(", deumire='").append(deumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
