package agentieTurism.template.main;

import agentieTurism.template.classes.PachetCazare;
import agentieTurism.template.classes.PachetTransport;
import agentieTurism.template.classes.PachetTransportCazare;
import agentieTurism.template.classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare(3);
        PachetTuristic pachetTransport = new PachetTransport(5);
        PachetTuristic pachetTransportCazare = new PachetTransportCazare(7);

        pachetCazare.vindePachet();
        pachetTransport.vindePachet();
        pachetTransportCazare.vindePachet();
    }
}
