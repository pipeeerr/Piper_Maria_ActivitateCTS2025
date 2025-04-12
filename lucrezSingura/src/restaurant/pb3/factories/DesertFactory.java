package restaurant.pb3.factories;

import restaurant.pb3.classes.CheeseCake;
import restaurant.pb3.classes.Clatite;
import restaurant.pb3.classes.FelMancare;
import restaurant.pb3.classes.Papanasi;

public class DesertFactory implements FelMancareFactory {
    @Override
    public FelMancare getFelMancare(TipFelMancare tip) {
        if(tip instanceof TipDesert tipDesert) {
            return switch(tipDesert) {
                case Clatite -> new Clatite();
                case Papanasi -> new Papanasi();
                case CheeseCake -> new CheeseCake();
            };
        }
        return null;
    }
}
