package ro.cts.pb1.classes;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
        this.ingrediente = ingrediente;
    }

    public double getPretPerSutaGr() {
        return pretPerSutaGr;
    }

    public abstract void preparareSupa();
    public double calculeazaPret() {
        return pretPerSutaGr * (gramaj / 100);
    }
}
