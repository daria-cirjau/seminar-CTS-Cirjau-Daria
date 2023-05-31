package dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String getSexValue;
    private int getVarstaValue;
    private boolean checkCNPValue;

    public PersoanaFake() {
        this.getSexValue = "M";
        this.getVarstaValue = 33;
        this.checkCNPValue = true;
    }

    @Override
    public String getSex() {
        return getSexValue;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPValue;
    }

    public PersoanaFake setGetSexValue(String getSexValue) {
        this.getSexValue = getSexValue;
        return this;
    }

    public PersoanaFake setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
        return this;
    }

    public PersoanaFake setCheckCNPValue(boolean checkCNPValue) {
        this.checkCNPValue = checkCNPValue;
        return this;
    }
}
