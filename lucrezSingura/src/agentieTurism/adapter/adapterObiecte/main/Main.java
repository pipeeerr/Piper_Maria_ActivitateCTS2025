package agentieTurism.adapter.adapterObiecte.main;

import agentieTurism.adapter.adapterObiecte.classes.PachetCazare;
import agentieTurism.adapter.adapterObiecte.classes.PachetMainaInchiriata;
import agentieTurism.adapter.adapterObiecte.classes.PachetTuristic;
import agentieTurism.adapter.adapterObiecte.softInchiriereMasini.Masina;
import agentieTurism.adapter.adapterObiecte.softInchiriereMasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.println("Pentru client: ");
        pachetTuristic.descriere();
        System.out.println("Pentru operator: ");
        pachetTuristic.rezervaPachet();
    }
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        PachetTuristic pachetMasina = new PachetMainaInchiriata(new MasinaInchiriata(new Masina("Opel", 1500)));
        printeazaRezervare(pachetMasina);
    }
}
