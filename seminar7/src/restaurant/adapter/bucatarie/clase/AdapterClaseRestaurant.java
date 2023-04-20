package restaurant.adapter.bucatarie.clase;

import restaurant.adapter.bar.clase.SoftBar;

public class AdapterClaseRestaurant extends SoftBar implements ISoftRestaurant {
    public AdapterClaseRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalSumaPlata) {

    }
}
