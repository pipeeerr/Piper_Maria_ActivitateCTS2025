package agentieTurism.simpleFactory.classes;

public class PachetCazareTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include si cazare si transport.");
    }
}
