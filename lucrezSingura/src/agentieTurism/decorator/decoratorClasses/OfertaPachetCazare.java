package agentieTurism.decorator.decoratorClasses;

import agentieTurism.decorator.classes.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic {
    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anuleazaRezervare() {
        System.out.println("Rezervarea de cazare a fost anulata.");
    }
}
