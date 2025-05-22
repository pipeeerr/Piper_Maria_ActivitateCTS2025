package agentieTurism.template.classes;

public class PachetTransport extends PachetTuristic {
    public PachetTransport(int cod) {
        super(cod);
    }

    @Override
    public void cautaCazare(int cod) {

    }

    @Override
    public void cautaTransport(int cod) {
        System.out.println("S- a gasit transport pentru pachetul cu codul " + this.cod);
    }

    @Override
    public void rezervaPachet(int cod) {
        System.out.println("S- a rezervat pachetul cu codul " + this.cod);
    }

    @Override
    public void platestePachet(int cod) {
        System.out.println("S- a platit pachetul cu codul " + this.cod);
    }
}
