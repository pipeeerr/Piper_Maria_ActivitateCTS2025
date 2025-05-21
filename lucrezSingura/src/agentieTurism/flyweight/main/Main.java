package agentieTurism.flyweight.main;

import agentieTurism.flyweight.classes.FabricaPachete;
import agentieTurism.flyweight.classes.Optionale;

public class Main {
    public static void main(String[] args) {
        FabricaPachete fabricaPachete = new FabricaPachete();

        Optionale optionale1 = new Optionale(true, 2);
        Optionale optionale2 = new Optionale(false, 3);

        fabricaPachete.getPachet(1).descrie(optionale1);
        optionale1.setNrExcursii(4);
        fabricaPachete.getPachet(1).descrie(optionale1);

        fabricaPachete.getPachet(2).descrie(optionale1);
        fabricaPachete.getPachet(2).descrie(optionale2);
    }
}
