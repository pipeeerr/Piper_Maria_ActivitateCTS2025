package agentieTurism.factoryMethod.factories;

import agentieTurism.factoryMethod.classes.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic crearePachet(TipPachetTuristic tip);
}
