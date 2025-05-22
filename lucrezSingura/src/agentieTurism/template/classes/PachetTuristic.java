package agentieTurism.template.classes;

public abstract class PachetTuristic {
    protected int cod;

    public PachetTuristic(int cod) {
        this.cod = cod;
    }

    public abstract void cautaCazare(int cod);
    public abstract void cautaTransport(int cod);
    public abstract void rezervaPachet(int cod);
    public abstract void platestePachet(int cod);

    public final void vindePachet() {
        cautaCazare(cod);
        cautaTransport(cod);
        rezervaPachet(cod);
        platestePachet(cod);
    }
}
