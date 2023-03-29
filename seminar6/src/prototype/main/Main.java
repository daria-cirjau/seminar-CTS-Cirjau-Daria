package prototype.main;

import prototype.classes.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> documente = new HashMap<>();
        documente.put("CI", 1);
        documente.put("Certificat nastere", 2);
        documente.put("Adeverinta", 9);
        ContBancar contBancar = new ContBancar("Detinator1", documente, 12);
        ContBancar contBancarCopie = (ContBancar) contBancar.cloneaza();

        System.out.println(contBancar == contBancarCopie);

        System.out.println(contBancar);
        System.out.println(contBancarCopie);

    }
}
