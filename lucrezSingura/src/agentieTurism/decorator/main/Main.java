package agentieTurism.decorator.main;

import agentieTurism.decorator.classes.PachetCazare;
import agentieTurism.decorator.classes.PachetTuristic;
import agentieTurism.decorator.decoratorClasses.OfertaPachetCazare;
import agentieTurism.decorator.decoratorClasses.OfertaPachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        pachetCazare.descriere();
        System.out.println("Nu poate fi anulat");
        System.out.println();

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetCazare);
        ofertaPachetTuristic.descriere();
        System.out.println("Acest pachet poate fi anulat.");
        ofertaPachetTuristic.anuleazaRezervare();
    }
}
