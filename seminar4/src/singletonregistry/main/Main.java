package singletonregistry.main;

import singletonregistry.classes.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica institutiePublica1 = InstitutiePublica.getInstanta("ANAF");
        institutiePublica1.setNumarAngajati(300);
        InstitutiePublica institutiePublica2 = InstitutiePublica.getInstanta("BNR");
        institutiePublica2.setNumarAngajati(400);
        InstitutiePublica institutiePublica3 = InstitutiePublica.getInstanta("ANAF");
        institutiePublica3.setNumarAngajati(560);

        System.out.println(institutiePublica1);
        System.out.println(institutiePublica2);
        System.out.println(institutiePublica3);
    }
}
