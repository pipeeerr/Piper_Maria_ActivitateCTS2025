package agentieTurism.simpleFactory.main;

import agentieTurism.simpleFactory.classes.AgentieFactory;
import agentieTurism.simpleFactory.classes.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory factory = new AgentieFactory();
        try {
            factory.createPachet(TipPachet.pachetCazare).descriere();
            factory.createPachet(TipPachet.pachetTransport).descriere();
            factory.createPachet(TipPachet.pachetCazareTransport).descriere();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
