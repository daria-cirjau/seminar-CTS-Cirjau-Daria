package restaurant.templatemethod.clase;

public abstract class IMasa {
    private int nr;

    public IMasa(int nr) {
        this.nr = nr;
    }

    protected abstract void curataMasa();

    protected abstract void aseazaMasa();

    protected abstract void aseazaServetele();

    protected abstract void aseazaTacamuri();

    protected abstract void invitaClienti();

    public synchronized final void ocupaMasa() {
        curataMasa();
        aseazaMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaClienti();
    }

    public int getNr() {
        return nr;
    }
}
