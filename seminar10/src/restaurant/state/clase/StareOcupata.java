package restaurant.state.clase;

public class StareOcupata implements IStare {
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            masa.setStare(this);
            System.out.println("Masa s-a ocupat!");
        } else {
            System.out.println("Masa este deja ocupata!");
        }
    }
}
