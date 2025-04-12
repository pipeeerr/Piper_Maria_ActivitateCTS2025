package restaurant.pb1.factory;

import restaurant.pb1.classes.Supa;
import restaurant.pb1.classes.SupaCiuperci;
import restaurant.pb1.classes.SupaLegume;
import restaurant.pb1.classes.SupaVita;

public class SupaFactory {
    private int cantitate;
    private float pretPerSutaDeGr;

    public SupaFactory(int cantitate, float pretPerSutaDeGr) {
        this.cantitate = cantitate;
        this.pretPerSutaDeGr = pretPerSutaDeGr;
    }

    public Supa creeazaSupa(TipSupa tip, float extra) {
        return switch (tip) {
            case Vita -> new SupaVita(this.cantitate, this.pretPerSutaDeGr, extra);
            case Legume -> new SupaLegume(this.cantitate, this.pretPerSutaDeGr, extra);
            case Ciuperci -> new SupaCiuperci(this.cantitate, this.pretPerSutaDeGr, extra);
            default -> null;
        };
    }
}
