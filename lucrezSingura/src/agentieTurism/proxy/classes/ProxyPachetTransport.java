package agentieTurism.proxy.classes;

public class ProxyPachetTransport implements PachetTuristic{
    private PachetTransport pachetTransport;

    public ProxyPachetTransport(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    public ProxyPachetTransport(Persoana persoana) {
        this.pachetTransport = new PachetTransport(persoana);
    }

    @Override
    public void descrie() {
        pachetTransport.descrie();
    }

    @Override
    public void rezerva() {
        if(pachetTransport.getPersoana().getVarsta() >= 65) {
            pachetTransport.rezerva();
        } else {
            System.out.println("Rezervarea nu este permisa, deoarece " + pachetTransport.getPersoana().getNume() + " are doar "
                    + pachetTransport.getPersoana().getVarsta() + " ani.");
        }
    }
}
