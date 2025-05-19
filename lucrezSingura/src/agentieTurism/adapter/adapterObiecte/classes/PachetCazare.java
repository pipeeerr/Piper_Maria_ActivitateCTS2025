package agentieTurism.adapter.adapterObiecte.classes;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar cazare.");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a efectuat o rezervare pentru cazare.");
    }
}


