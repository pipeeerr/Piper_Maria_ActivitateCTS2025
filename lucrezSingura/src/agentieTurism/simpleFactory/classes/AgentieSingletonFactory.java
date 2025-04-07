package agentieTurism.simpleFactory.classes;

public class AgentieSingletonFactory {
    private static AgentieSingletonFactory instanta = null;

    private AgentieSingletonFactory() {
    }

    public static AgentieSingletonFactory getInstanta() {
        if (instanta == null) {
            instanta = new AgentieSingletonFactory();
        }
        return instanta;
    }

    public PachetTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch (tipPachet) {
            case pachetCazare -> {
                return new PachetCazare();
            }
            case pachetCazareTransport -> {
                return new PachetCazareTransport();
            }
            case pachetTransport -> {
                return new PachetTransport();
            }
            default -> {
                throw new Exception("Tipul primit nu este corect");            }
        }
    }
}
