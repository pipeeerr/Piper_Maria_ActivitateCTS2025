package agentieTurism.factoryMethod.factories;

import agentieTurism.factoryMethod.classes.PachetTuristic;
import agentieTurism.factoryMethod.classes.TransportAutocar;
import agentieTurism.factoryMethod.classes.TransportTren;

public class TransportFactory implements PachetTuristicFactory {
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        if(tip instanceof TipPachetTransport tipPachetTransport) {
            return switch (tipPachetTransport) {
                case Autocar -> new TransportAutocar();
                case Tren -> new TransportTren();
            };
        }
        return null;
    }
}
