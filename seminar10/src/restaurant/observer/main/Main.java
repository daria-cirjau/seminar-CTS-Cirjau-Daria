package restaurant.observer.main;

import restaurant.observer.clase.Client;
import restaurant.observer.clase.IObserver;
import restaurant.observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IObserver client1 = new Client("Client1");
        IObserver client2 = new Client("Client2");
        IObserver client3 = new Client("Client3");

        Restaurant restaurant = new Restaurant("Tratoria Monza");
        restaurant.introduceOfertaNoua();
        restaurant.abonareClient(client1);
        restaurant.adaugaDiscount(30);
        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);
        restaurant.introduceOfertaNoua();
    }
}
