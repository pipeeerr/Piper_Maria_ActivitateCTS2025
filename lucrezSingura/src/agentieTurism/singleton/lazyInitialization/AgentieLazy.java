package agentieTurism.singleton.lazyInitialization;

public class AgentieLazy {
    private String nume;
    private float capital;
    private int numarAngajati;

    private static AgentieLazy instanta = null;

    private AgentieLazy(String nume, float capital, int numarAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieLazy getInstanta(String nume, float capital, int numarAngajati) {
        if(instanta == null) {
            instanta = new AgentieLazy(nume, capital, numarAngajati);
        }
        return instanta;
    }
}
