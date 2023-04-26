package facade.main;

import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.interneazaPacient("Pacient 1");
        facade.interneazaPacient("Pacient 1.5");
        facade.interneazaPacient("Pacient 2");
        facade.interneazaPacient("Pacient 3");
        facade.interneazaPacient("Pacient 4");
    }
}
