package STB.pb10.main;

import STB.pb10.classes.*;

public class Main {
    public static void main(String[] args) {
        final float pretBilet = 3;
        IMetodaPlata plataCardCalatorie = new CardCalatorie(1);
        Calator calator1 = new Calator("Maria", plataCardCalatorie);
        calator1.platesteBilet(pretBilet);
        calator1.setMetodaPlata(new CardBancar(1500));
        calator1.platesteBilet(pretBilet);
        calator1.setMetodaPlata(new PlataSMS());
        calator1.platesteBilet(pretBilet);
        calator1.setMetodaPlata(plataCardCalatorie);
        calator1.platesteBilet(pretBilet);
    }
}
