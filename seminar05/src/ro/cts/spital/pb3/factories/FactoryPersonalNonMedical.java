package ro.cts.spital.pb3.factories;

import ro.cts.spital.pb3.classes.Angajat;
import ro.cts.spital.pb3.classes.Portar;
import ro.cts.spital.pb3.classes.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        if (tipPersonal instanceof TipPersonalNonMedical nonMedical) {
            return switch (nonMedical) {
                case SECRETAR -> new Secretar(nume, salariu, vechime);
                case PORTAR -> new Portar(nume, salariu, vechime);
            };
        }
        return null;
    }
}
