package ro.cts.pb1.classes;

public class SupaLegume extends Supa{
    private double gramajCrutoane;
    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu " + gramajCrutoane + " grame de crutoane este gata");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + super.getPretPerSutaGr() * (gramajCrutoane / 100) * 2;
    }
}
