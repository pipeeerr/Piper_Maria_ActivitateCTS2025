package ro.cts.pb1.classes;

public class SupaVita extends Supa{
    private double pretExtra ;

    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita comandata cu smantana in valoare de " + pretExtra + " este gata");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + pretExtra;
    }
}
