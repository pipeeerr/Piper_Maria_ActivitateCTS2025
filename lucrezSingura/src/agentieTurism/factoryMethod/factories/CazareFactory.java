package agentieTurism.factoryMethod.factories;

import agentieTurism.factoryMethod.classes.CazareCabana;
import agentieTurism.factoryMethod.classes.CazareHotel;
import agentieTurism.factoryMethod.classes.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        if(tip instanceof TipPachetCazare tipPachetCazare) {
            return switch (tipPachetCazare) {
                case Cabana -> new CazareCabana();
                case Hotel -> new CazareHotel();
            };
        }
        return null;
    }
}
