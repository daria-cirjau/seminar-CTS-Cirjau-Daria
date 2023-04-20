package restaurant.adapter.bucatarie.clase;

public class SoftBucatarie implements ISoftRestaurant{
    private String denumireBucatar;

    public SoftBucatarie(String denumireBucatar) {
        this.denumireBucatar = denumireBucatar;
    }

    @Override
    public void printeazaNota(double totalSumaPlata) {
        System.out.println("Bucatar " + this.denumireBucatar + " suma nota "+ totalSumaPlata);
    }
}
