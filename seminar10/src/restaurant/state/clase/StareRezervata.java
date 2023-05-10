package restaurant.state.clase;

public class StareRezervata implements IStare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            masa.setStare(this);
            System.out.println("Masa este rezervata acum!");
        } else {
            System.out.println("Masa nu poate fi rezervata!");
        }
    }
}
