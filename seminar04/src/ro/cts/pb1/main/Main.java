package ro.cts.pb1.main;

import ro.cts.pb1.classes.Supa;
import ro.cts.pb1.factory.Factory;
import ro.cts.pb1.factory.TipuriSupe;

// pb 1 din restaurant.pdf
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(200, 10);
        Supa supaLegume = factory.getSupa(TipuriSupe.LEGUME, "Bors, Legume", 100);
        supaLegume.preparareSupa();
        Supa supaVita = factory.getSupa(TipuriSupe.VITA, "Vita, Bors", 15);
        supaVita.preparareSupa();
        Supa supaCiuperci = factory.getSupa(TipuriSupe.CIUPERCI, "Ciuperci, Bors", 110);
        supaCiuperci.preparareSupa();
    }
}
