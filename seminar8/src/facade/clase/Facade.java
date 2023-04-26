package facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugaPat(new Pacient("Pacient 1", 7));
        medic.adaugaPat(new Pacient("Pacient 2", 2));
        medic.adaugaPat(new Pacient("Pacient 3", 5));
        this.salon = new Salon();
        salon.adaugaPat(3);
        salon.adaugaPat(10);
    }

    public void interneazaPacient(String numePacient) {
        Pacient pacient;
        if(salon.verificaPaturiLibere()){
            if(medic.verificaTrimitere(pacient  = medic.getPacient(numePacient))){
                if(pacient.getGravitate() > 4){
                    System.out.println("Pacientul " + numePacient + " a fost internat.");
                    salon.ocupaPat();
                } else {
                    System.out.println("Starea pacientului nu este suficient de grava pentru a fi internat.");
                }
            } else {
                System.out.println("Pacientul nu are trimitere!");
            }
        } else {
            System.out.println("Spitalul nu are paturi libere.");
        }
    }
}
