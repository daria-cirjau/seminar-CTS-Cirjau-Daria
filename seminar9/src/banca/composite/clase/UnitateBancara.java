package banca.composite.clase;

public abstract class UnitateBancara {
    public abstract void adaugaUnitate(UnitateBancara unitateBancara);

    public abstract void steregUnitate(UnitateBancara unitateBancara);

    public abstract UnitateBancara getUnitate(int index);

    public abstract void printeazaDescreiere(String indentare);
}