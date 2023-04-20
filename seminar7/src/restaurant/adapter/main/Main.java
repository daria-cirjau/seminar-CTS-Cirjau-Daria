package restaurant.adapter.main;

import restaurant.adapter.bar.clase.ISoftBar;
import restaurant.adapter.bar.clase.SoftBar;
import restaurant.adapter.bucatarie.clase.AdapterClaseRestaurant;
import restaurant.adapter.bucatarie.clase.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.clase.ISoftRestaurant;
import restaurant.adapter.bucatarie.clase.SoftBucatarie;

public class Main {
    public static void imprimare(ISoftRestaurant iSoftRestaurant, double valoare){
        iSoftRestaurant.printeazaNota(valoare);
    }
    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Bar 1");
        bar.printeazaNotaBauturi(230);

        ISoftRestaurant bucatarie = new SoftBucatarie("George");
        bucatarie.printeazaNota(100);

        Main.imprimare(bucatarie,500);
        AdapterClaseRestaurant adapterRestaurant = new AdapterClaseRestaurant("Alcadibo");
        Main.imprimare(adapterRestaurant, 450);

        AdapterObiecteRestaurant adapterObiecteRestaurant = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecteRestaurant, 150);
    }
}
