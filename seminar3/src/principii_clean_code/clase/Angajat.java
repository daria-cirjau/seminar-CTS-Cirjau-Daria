package principii_clean_code.clase;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();

    }


    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Angajat: {");
        stringBuffer.append(super.toString());
        stringBuffer.append(", salariu =").append(salariu);
        stringBuffer.append(", ocupatie =").append(ocupatie);
        return stringBuffer.toString();
    }


    public int finantare() {
        int s = 10;
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }

}
