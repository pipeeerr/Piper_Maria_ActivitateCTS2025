package agentieTurism.singleton.eagerInitialization;

public class AgentieEager {
    private String nume;
    private float capital;
    private int numarAngajati;

    private static final AgentieEager instanta = new AgentieEager();

    private AgentieEager() {
        this.nume = "AgeTur";
        this.capital = 1000;
        this.numarAngajati = 10;
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

    public static AgentieEager getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
