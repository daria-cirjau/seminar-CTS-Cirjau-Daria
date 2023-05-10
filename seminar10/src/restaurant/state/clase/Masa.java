package restaurant.state.clase;

public class Masa {
    private int numar;
    private IStare stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public int getNumar() {
        return numar;
    }

    public IStare getStare() {
        return stare;
    }

    public void ocupaMasa(){
        IStare stare = new StareOcupata();
        stare.modificaStare(this);
    }

    public void rezervaMasa(){
        IStare stare = new StareRezervata();
        stare.modificaStare(this);
    }

    public void elibereazaMasa(){
        IStare stare = new StareLibera();
        stare.modificaStare(this);
    }
}
