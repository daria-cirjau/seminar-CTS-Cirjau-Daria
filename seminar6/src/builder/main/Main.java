package builder.main;

import builder.classes.ContBancar;
import builder.classes.ContBancarBuilder;
import builder.classes.ContBancarBuilderv2;
import builder.classes.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder contBancarBuilder = new ContBancarBuilder();
        ContBancar contBancar1 = contBancarBuilder
                .setNumeClient("Client1")
                .setCardAtasat(true)
                .build();

        IBuilder contBancarBuilder2 = new ContBancarBuilder();
        ContBancar contBancar2 = contBancarBuilder2
                .setNumeClient("Client2")
                .setPrimesteSalariu(true)
                .setCardAtasat(true)
                .build();

        System.out.println(contBancar1);
        System.out.println(contBancar2);

        IBuilder contBancarBuilderv2 = new ContBancarBuilderv2();
        ContBancar contBancarv21 = contBancarBuilderv2
                .setNumeClient("Client 1 v2")
                .setInternetBanking(true)
                .setCardAtasat(true)
                .build();

        ContBancar contBancarv22 = contBancarBuilderv2
                .setNumeClient("Client 2 v2")
                .build();

        System.out.println(contBancarv21);
        System.out.println(contBancarv22);
    }
}
