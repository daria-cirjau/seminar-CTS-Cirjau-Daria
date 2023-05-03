package banca.composite.clase;

public class Filiala extends UnitateBancara {
    private int nrAngajati;
    private String denumire;

    public Filiala(int nrAngajati, String denumire) {
        this.nrAngajati = nrAngajati;
        this.denumire = denumire;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException("Metoda nu este implementata pt nodul frunza");
    }

    @Override
    public void steregUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException("Metoda nu este implementata pt nodul frunza");
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException("Metoda nu este implementata pt nodul frunza");
    }

    @Override
    public void printeazaDescreiere(String indentare) {
        final StringBuffer sb = new StringBuffer(indentare);
        sb.append("Filiala{");
        sb.append("nrAngajati=").append(nrAngajati);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        System.out.println(sb);
    }

}
