package factorymethod.classes;

public class Anestezist extends PersonalSpital {
    private int vechime;

    public Anestezist(String nume, int vechime) {
        super(nume);
        this.vechime = vechime;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Anestezistul " + super.getNume() + " vechime " + this.vechime);
    }
}
