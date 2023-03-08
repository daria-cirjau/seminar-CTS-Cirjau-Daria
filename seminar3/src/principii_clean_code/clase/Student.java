package principii_clean_code.clase;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;
    private static int sumaFinantare = 30;


    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }


    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Student:{");
        stringBuffer.append(super.toString());
        stringBuffer.append(", facultate =").append(facultate);
        stringBuffer.append(", anStudii =").append(anStudii);
        return stringBuffer.toString();
    }

    public void afisareSumaFinantare() {
        super.afisareSumaFinantare("Student", Student.sumaFinantare);
    }

}
