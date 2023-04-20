package restaurant.proxy.clase;

public class Restaurant implements IRestaurant{
    private String denumire;

    public Restaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {
        System.out.println("Rezervare la " + this.denumire + " nr persoane " + nrPersoane);
    }
}
