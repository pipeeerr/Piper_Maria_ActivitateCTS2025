package agentieTurism.proxy.main;

import agentieTurism.proxy.classes.PachetTransport;
import agentieTurism.proxy.classes.PachetTuristic;
import agentieTurism.proxy.classes.Persoana;
import agentieTurism.proxy.classes.ProxyPachetTransport;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Maria", 21);
        Persoana persoana2 = new Persoana("Aurelia", 73);
        PachetTuristic pachet1 = new PachetTransport(persoana);
        pachet1.rezerva();
        PachetTuristic pachet2 = new ProxyPachetTransport(persoana);
        pachet2.rezerva();
        PachetTuristic pachet3 = new ProxyPachetTransport(persoana2);
        pachet3.rezerva();
    }
}
