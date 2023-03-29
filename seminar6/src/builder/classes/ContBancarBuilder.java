package builder.classes;

public class ContBancarBuilder implements IBuilder {
    private ContBancar contBancar;

    public ContBancarBuilder() {
        this.contBancar = new ContBancar(false, false, false, "N/A");
    }

    @Override
    public ContBancar build() {
        return this.contBancar;
    }

    public ContBancarBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBancarBuilder setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    public ContBancarBuilder setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return this;
    }
}
