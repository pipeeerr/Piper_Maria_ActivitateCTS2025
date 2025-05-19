package agentieTurism.facade.main;

import agentieTurism.facade.classes.Facade;

public class Main {
    public static void main(String[] args) {
        Facade rezervareSejur = new Facade();
        rezervareSejur.rezervaPachetCazareZbor("Bucuresti", "Paris");
    }
}
