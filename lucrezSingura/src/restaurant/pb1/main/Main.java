package restaurant.pb1.main;

import restaurant.pb1.classes.Supa;
import restaurant.pb1.classes.SupaVita;
import restaurant.pb1.factory.SupaFactory;
import restaurant.pb1.factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        Supa supaLegume = new SupaFactory(300, 8.5f).creeazaSupa(TipSupa.Legume, 0);
        Supa supaVita = new SupaFactory(350, 10).creeazaSupa(TipSupa.Vita, 15);

        supaVita.preparareSupa();
        supaLegume.preparareSupa();
    }
}
