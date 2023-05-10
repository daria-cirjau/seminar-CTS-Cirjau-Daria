package restaurant.observer.clase;

public interface IRestaurant {
    void abonareClient(IObserver observer);

    void dezabonareClient(IObserver observer);

    void notificareClienti(String mesaj);
}
