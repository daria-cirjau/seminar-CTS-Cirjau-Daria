package factorymethod.factory;


import factorymethod.classes.PersonalSpital;

public interface Factory {
    public PersonalSpital createPersonal(String nume);
}
