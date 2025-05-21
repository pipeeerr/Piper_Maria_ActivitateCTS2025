package agentieTurism.proxy.classes;

public class PachetTransport implements PachetTuristic{
    private Persoana persoana;

    public PachetTransport(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void descrie() {
        System.out.println("Acest pachet include transport pentru persoanele cu varsta peste 65 de ani.");
    }

    @Override
    public void rezerva() {
        System.out.println("S-a rezervat pachetul pentru " + this.persoana.getNume() + ".");
    }

    public Persoana getPersoana() {
        return persoana;
    }
}
