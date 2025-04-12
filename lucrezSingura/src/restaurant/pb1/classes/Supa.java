package restaurant.pb1.classes;

public abstract class Supa {
    private int cantitate;
    private float pretPeSutaDeGrame;

    public Supa(int cantitate, float pretPeSutaDeGrame) {
        this.cantitate = cantitate;
        this.pretPeSutaDeGrame = pretPeSutaDeGrame;
    }

    public float getPretPeSutaDeGrame() {
        return this.pretPeSutaDeGrame;
    }

    public abstract void preparareSupa();

    public float calculeazaPret() {
        return pretPeSutaDeGrame * (cantitate / 100);
    }
}
