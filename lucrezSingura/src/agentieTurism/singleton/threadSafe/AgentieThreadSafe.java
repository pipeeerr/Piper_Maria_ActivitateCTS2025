package agentieTurism.singleton.threadSafe;

public class AgentieThreadSafe {
    private String nume;
    private float capital;
    private int numarAngajati;
    private static AgentieThreadSafe instance = null;

    private AgentieThreadSafe(String nume, float capital, int numarAngajati) {
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

    public static synchronized AgentieThreadSafe getInstance(String nume, float capital, int numarAngajati) {
        if (instance == null) {
            instance = new AgentieThreadSafe(nume, capital, numarAngajati);
        }
        return instance;
    }
}
