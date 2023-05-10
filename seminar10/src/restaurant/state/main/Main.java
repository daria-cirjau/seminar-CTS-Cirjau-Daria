package restaurant.state.main;

import restaurant.state.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa3 = new Masa(3);
        masa3.ocupaMasa();
        masa3.ocupaMasa();
        masa3.rezervaMasa();
        masa3.elibereazaMasa();
        masa3.rezervaMasa();
    }
}
