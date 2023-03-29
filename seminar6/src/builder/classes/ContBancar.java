package builder.classes;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String numeClient;

    protected ContBancar(boolean primesteSalariu, boolean cardAtasat, boolean internetBanking, String numeClient) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.numeClient = numeClient;
    }

    public void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
