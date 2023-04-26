package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacienti;

    public Medic() {
        pacienti = new ArrayList<>();
    }

    public void adaugaPat(Pacient pacient) {
        pacienti.add(pacient);
    }

    public boolean verificaTrimitere(Pacient pacient) {
        return this.pacienti.contains(pacient);
    }

    public Pacient getPacient(String nume) {
        for (Pacient pacient : this.pacienti) {
            if (pacient.getNume().equals(nume))
                return pacient;
        }
        return null;
    }

}