package restaurant.pb3.main;

import restaurant.pb3.classes.FelMancare;
import restaurant.pb3.factories.*;

public class Main {
    public static void main(String[] args) {
        FelMancareFactory desertFactory = new DesertFactory();
        FelMancareFactory supaFactory = new SupaFactory();

        FelMancare fel1 = supaFactory.getFelMancare(TipSupa.Vita);
        FelMancare fel2 = desertFactory.getFelMancare(TipDesert.CheeseCake);

        fel1.notaDePlata();
        fel2.notaDePlata();
    }
}
