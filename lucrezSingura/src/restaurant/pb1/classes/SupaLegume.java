package restaurant.pb1.classes;

public class SupaLegume extends Supa {
    private float cantitateCrutoane;

    public SupaLegume(int cantitate, float pretPeSutaDeGrame, float cantitateCrutoane) {
        super(cantitate, pretPeSutaDeGrame);
        this.cantitateCrutoane = cantitateCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume avand " + cantitateCrutoane + " grame de crutoane este gata.");
    }

    @Override
    public float calculeazaPret() {
        return super.calculeazaPret() + (cantitateCrutoane / 100) * super.getPretPeSutaDeGrame() / 2 ;
    }
}
