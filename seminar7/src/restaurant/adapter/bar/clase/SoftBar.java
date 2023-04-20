package restaurant.adapter.bar.clase;

public class SoftBar implements ISoftBar{
    private String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaNotaBauturi(double totalSumaPlata) {
        System.out.println("Bar " + this.denumire + " suma nota " + totalSumaPlata);
    }
}
