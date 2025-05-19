package agentieTurism.facade.classes;

public class Facade {
    public void rezervaPachetCazareZbor(String orasPlecare, String orasDestinatie) {
        CompanieAeriana companieAeriana = new CompanieAeriana("PipeeerrAirLines");
        Zbor zborDus = companieAeriana.rezrvaZbor(orasPlecare, orasDestinatie);
        Zbor zborIntoarcere = companieAeriana.rezrvaZbor(orasDestinatie, orasPlecare);

        Hotel hotel = new Hotel("Pipeeerr Hotel");
        hotel.rezervaCamera(orasDestinatie);

        System.out.println(zborDus.toString());
        System.out.println(zborIntoarcere.toString());
    }
}
