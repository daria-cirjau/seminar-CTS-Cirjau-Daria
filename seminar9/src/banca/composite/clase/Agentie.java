package banca.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends UnitateBancara {
    private int nrAngajati;
    private String denumire;
    private List<UnitateBancara> unitatiBancare;

    public Agentie(int nrAngajati, String denumire) {
        this.nrAngajati = nrAngajati;
        this.denumire = denumire;
        this.unitatiBancare = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        unitatiBancare.add(unitateBancara);
    }

    @Override
    public void steregUnitate(UnitateBancara unitateBancara) {
        unitatiBancare.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return unitatiBancare.get(index);
    }

    @Override
    public void printeazaDescreiere(String indentare) {
        final StringBuffer sb = new StringBuffer(indentare);
        sb.append("Agentie{");
        sb.append("nrAngajati=").append(nrAngajati);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        for (UnitateBancara unitateBancara : unitatiBancare) {
            unitateBancara.printeazaDescreiere(indentare);
        }
        System.out.println(sb);
    }
}
