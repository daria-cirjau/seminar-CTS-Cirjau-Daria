package banca.strategy.clase;

public class Operator {
    private ModVerificare modVerificare;

    public Operator() {
        modVerificare = new VerificareClientPF();
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaClient(){
        modVerificare.verifica();
    }
}
