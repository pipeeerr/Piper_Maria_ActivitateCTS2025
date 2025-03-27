package ro.cts.spital.pb3.factories;

import ro.cts.spital.pb3.classes.Angajat;
import ro.cts.spital.pb3.classes.Asistent;
import ro.cts.spital.pb3.classes.Medic;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        if (tipPersonal instanceof TipPersonalMedical medical) {
            return switch (medical) {
                case ASISTENT -> new Asistent(nume, salariu, spor);
                case MEDIC -> new Medic(nume, salariu, spor);
            };
        }
        return null;
    }
}
