package banca.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, ClientBanca> conturiBancare;

    public FlyweightFactory() {
        this.conturiBancare = new HashMap<>();
    }

    public ClientBanca getDetinator(String nume, String nrTelefon, String adresaMail) {
        if (!conturiBancare.containsKey(nume)) {
            conturiBancare.put(nume, new Detinator(nume, nrTelefon, adresaMail));
        }
        return conturiBancare.get(nume);
    }

}
