package restaurant.pb3.factories;

import restaurant.pb3.classes.FelMancare;

public interface FelMancareFactory {
    FelMancare getFelMancare(TipFelMancare tip);
}
