package agentieTurism.adapter.adapterClase.main;

import agentieTurism.adapter.adapterClase.classes.PachetCazare;
import agentieTurism.adapter.adapterClase.classes.PachetMasinaInchiriata;
import agentieTurism.adapter.adapterClase.classes.PachetTuristic;
import agentieTurism.adapter.adapterClase.softInchiriereMaisni.Masina;

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

        PachetTuristic pachetMasina = new PachetMasinaInchiriata(new Masina("Skoda", 2000));
        printeazaRezervare(pachetMasina);
    }
}
