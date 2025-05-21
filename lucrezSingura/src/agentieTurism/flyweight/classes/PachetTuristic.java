package agentieTurism.flyweight.classes;

public class PachetTuristic implements IPachetTuristic {
    private int cod;
    private String hotel;
    private String destinatie;
    private boolean areMicDejun;

    public PachetTuristic(int cod, String hotel, String destinatie, boolean areMicDejun) {
        this.cod = cod;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.areMicDejun = areMicDejun;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public boolean isAreMicDejun() {
        return areMicDejun;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("cod=").append(cod);
        sb.append(", hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", areMicdejun=").append(areMicDejun);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrie(Optionale optionale) {
        System.out.println("Pachetul turistic cu codul " + this.cod
                + " are cazare la hotelul " + this.hotel
                + ", din destinatia " + this.destinatie
                + ", " + (areMicDejun ? "are" : "nu are") + " micul dejun inclus, "
                + (optionale.isAreCina() ? "are" : "nu are") + " cina inclusa "
                + " si " + optionale.getNrExcursii() + " excursii pe zi.");
    }
}
