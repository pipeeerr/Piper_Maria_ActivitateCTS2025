package agentieTurism.template.classes;

public class PachetCazare extends PachetTuristic {
    public PachetCazare(int cod) {
        super(cod);
    }

    @Override
    public void cautaCazare(int cod) {
        System.out.println("S- a gasit cazare pentru pachetul cu codul " + this.cod);
    }

    @Override
    public void cautaTransport(int cod) {

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
