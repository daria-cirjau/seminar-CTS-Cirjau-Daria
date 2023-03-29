package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContBancar {
    private String detinator;
    private Map<String, Integer> documente;
    private int numarFileDosar;

    public ContBancar() {
        this.documente = new HashMap<>();
    }

    public ContBancar(String detinator, Map<String, Integer> documente, int numarFileDosar)  {
        int sum = 0;
        for (Integer file : documente.values()) {
            sum += file;
        }

        if (sum == numarFileDosar) {
            this.detinator = detinator;
            this.documente = documente;
            this.numarFileDosar = numarFileDosar;
        } else {
            throw new IllegalArgumentException("Numar incorect");
        }
    }

    @Override
    public IContBancar cloneaza() {
        ContBancar contBancarCopie = new ContBancar();
        contBancarCopie.detinator = this.detinator;
        contBancarCopie.documente.putAll(this.documente);
        contBancarCopie.numarFileDosar = this.numarFileDosar;
        return contBancarCopie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", documente=").append(documente);
        sb.append(", numarFileDosar=").append(numarFileDosar);
        sb.append('}');
        return sb.toString();
    }
}
