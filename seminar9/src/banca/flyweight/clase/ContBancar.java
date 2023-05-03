package banca.flyweight.clase;

public class ContBancar {
    private float suma;
    private int numarCont;

    public ContBancar(float suma, int numarCont) {
        this.suma = suma;
        this.numarCont = numarCont;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("suma=").append(suma);
        sb.append(", numarCont='").append(numarCont).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
