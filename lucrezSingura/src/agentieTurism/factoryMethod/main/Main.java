package agentieTurism.factoryMethod.main;

import agentieTurism.factoryMethod.classes.PachetTuristic;
import agentieTurism.factoryMethod.factories.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory cazareFactory = new CazareFactory();
        PachetTuristicFactory transportFactory = new TransportFactory();

        PachetTuristic pachet = cazareFactory.crearePachet(TipPachetCazare.Hotel);
        pachet.descriere();

        pachet = transportFactory.crearePachet(TipPachetTransport.Autocar);
        pachet.descriere();
    }
}
