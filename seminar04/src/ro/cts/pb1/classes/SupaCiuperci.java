package ro.cts.pb1.classes;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;
    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu cantitatea de ciuperci " + cantitateCiuperci + " este gata");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + super.getPretPerSutaGr() * (cantitateCiuperci / 100);
    }
}
