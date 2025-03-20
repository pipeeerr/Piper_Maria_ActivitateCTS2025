package ro.cts.pb1.factory;

import ro.cts.pb1.classes.Supa;
import ro.cts.pb1.classes.SupaCiuperci;
import ro.cts.pb1.classes.SupaLegume;
import ro.cts.pb1.classes.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPerSutaGr;

    public Factory(int gramaj, double pretPerSutaGr) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
    }

    public Supa getSupa(TipuriSupe supa, String ingrediente, double extra) {
         return switch (supa) {
             case LEGUME -> new SupaLegume(gramaj, pretPerSutaGr, ingrediente, extra);
             case VITA -> new SupaVita(gramaj, pretPerSutaGr, ingrediente, extra);
             case CIUPERCI -> new SupaCiuperci(gramaj, pretPerSutaGr, ingrediente, extra);
             default -> null;
        };
    }
}
