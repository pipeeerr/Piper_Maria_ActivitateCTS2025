package agentieTurism.simpleFactory.classes;

public class AgentieFactory {
    public PachetTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch (tipPachet) {
            case pachetCazare:
                return new PachetCazare();
            case pachetTransport:
                return new PachetTransport();
            case pachetCazareTransport:
                return new PachetCazareTransport();
            default:
                throw new Exception("Tipul primit nu este corect.");
        }
    }
}
