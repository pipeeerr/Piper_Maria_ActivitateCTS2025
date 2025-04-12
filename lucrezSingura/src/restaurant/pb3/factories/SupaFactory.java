package restaurant.pb3.factories;

import restaurant.pb3.classes.FelMancare;
import restaurant.pb3.classes.SupaCiuperci;
import restaurant.pb3.classes.SupaLegume;
import restaurant.pb3.classes.SupaVita;

public class SupaFactory implements FelMancareFactory {
    @Override
    public FelMancare getFelMancare(TipFelMancare tip) {
        if(tip instanceof TipSupa tipSupa) {
            return switch (tipSupa) {
                case Vita -> new SupaVita();
                case Legume -> new SupaLegume();
                case Ciuperci -> new SupaCiuperci();
            };
        }
        return null;
    }
}
