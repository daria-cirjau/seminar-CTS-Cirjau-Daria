package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon(List<Integer> coduriPaturiLibere) {
        this.coduriPaturiLibere = coduriPaturiLibere;
    }

    public Salon() {
        this.coduriPaturiLibere = new ArrayList<>();
    }

    public void adaugaPat(Integer pat) {
        coduriPaturiLibere.add(pat);
    }

    public boolean verificaPaturiLibere() {
        return coduriPaturiLibere.size() > 0;
    }

    public void ocupaPat(){
        coduriPaturiLibere.remove(0);
    }
}