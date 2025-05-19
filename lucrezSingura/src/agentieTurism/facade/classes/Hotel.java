package agentieTurism.facade.classes;

public class Hotel {
    private String nume;

    public Hotel(String nume) {
        this.nume = nume;
    }

    public void rezervaCamera(String oras) {
        System.out.println("Rezervare efectuata la hotelul " + this.nume + " din orasul " + oras);
    }
}
