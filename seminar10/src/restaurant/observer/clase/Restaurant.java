package restaurant.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private List<IObserver> observers;
    private String nume;

    public Restaurant(String nume) {
        this.observers = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void abonareClient(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void dezabonareClient(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for (IObserver observer : this.observers) {
            observer.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua() {
        String mesaj = this.nume + " oferta noua!";
        this.notificareClienti(mesaj);
    }

    public void adaugaDiscount(int discount) {
        String mesaj = this.nume + " discount! " + discount + " %";
        this.notificareClienti(mesaj);
    }
}
