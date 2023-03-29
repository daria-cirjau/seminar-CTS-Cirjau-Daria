package builder.classes;

public interface IBuilder {
    ContBancar build();

    IBuilder setNumeClient(String client);

    IBuilder setPrimesteSalariu(boolean primesteSalariu);

    IBuilder setCardAtasat(boolean cardAtasat);

    IBuilder setInternetBanking(boolean internetBanking);

}
