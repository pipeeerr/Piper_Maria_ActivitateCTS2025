package agentieTurism.decorator.classes;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet include cazare.");
    }
}
