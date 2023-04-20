package restaurant.adapter.bucatarie.clase;

import restaurant.adapter.bar.clase.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant{
    ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalSumaPlata) {
        this.softBar.printeazaNotaBauturi(totalSumaPlata);
    }
}
