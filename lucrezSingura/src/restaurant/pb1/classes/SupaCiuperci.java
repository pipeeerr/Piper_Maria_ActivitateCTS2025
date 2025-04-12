package restaurant.pb1.classes;

public class SupaCiuperci extends Supa {
    private float cantitateCiuperci;

    public SupaCiuperci(int cantitate, float pretPeSutaDeGrame, float cantitateCiuperci) {
        super(cantitate, pretPeSutaDeGrame);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu cantitatea de ciuperci de " + cantitateCiuperci + " este gata.");
    }

    @Override
    public float calculeazaPret() {
        return super.calculeazaPret() + super.getPretPeSutaDeGrame() * (cantitateCiuperci / 100);
    }
}
