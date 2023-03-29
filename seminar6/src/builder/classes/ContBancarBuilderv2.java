package builder.classes;

public class ContBancarBuilderv2 implements IBuilder{
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String numeClient;

    public ContBancarBuilderv2() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.internetBanking = false;
        this.numeClient = "Client Default";
    }

    public ContBancarBuilderv2 setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public ContBancarBuilderv2 setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBancarBuilderv2 setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancar build() {
        ContBancar contBancar = new ContBancar(this.primesteSalariu, this.cardAtasat, this.internetBanking, this.numeClient);
        return contBancar;
    }

    public ContBancarBuilderv2 setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }
}
