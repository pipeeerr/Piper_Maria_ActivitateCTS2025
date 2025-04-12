package restaurant.pb1.classes;

public class SupaVita extends Supa {
    private float cantitateSmantana;
    private static float pretSmantana = 17;

    public SupaVita(int cantitate, float pretPeSutaDeGrame, float cantitateSmantana) {
        super(cantitate, pretPeSutaDeGrame);
        this.cantitateSmantana = cantitateSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu cantitateade smantana de " + cantitateSmantana + " grame este gata.");
    }

    @Override
    public float calculeazaPret() {
            return super.calculeazaPret() + pretSmantana * cantitateSmantana / 100;
    }
}
