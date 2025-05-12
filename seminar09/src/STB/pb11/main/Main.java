package STB.pb11.main;

import STB.pb11.classes.Autobuz;
import STB.pb11.classes.Calator;
import STB.pb11.classes.MijlocTransport;
import STB.pb11.classes.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("Calator 1");
        Observer calator2 = new Calator("Calator 2");
        Observer calator3 = new Calator("Calator 3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);

        autobuz.pleacaDeLaCapat();

        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseul();
    }
}
