package singletonregistry.classes;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;
    private static Map<String, InstitutiePublica> registruInstitutii = new HashMap<>();

    private InstitutiePublica(String denumire) {
        this.denumire = denumire;
        this.numarAngajati = 0;
    }

    public static synchronized InstitutiePublica getInstanta(String denumire) {
        if (!InstitutiePublica.registruInstitutii.containsKey(denumire)) {
            InstitutiePublica.registruInstitutii.put(denumire, new InstitutiePublica(denumire));
        }

        return InstitutiePublica.registruInstitutii.get(denumire);
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
