package agentieTurism.singleton.staticBlock;

public class AgentieStaticBlock {
    private String nume;
    private float capital;
    private int numarAngajati;

    private static AgentieStaticBlock instanta;

    static {
        try {
            instanta = new AgentieStaticBlock();
        } catch (Exception e) {
            System.out.println("Eroare la crearea agentiei");
        }
    }

    private AgentieStaticBlock() {
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

    public static AgentieStaticBlock getInstanta() {
        return instanta;
    }
}
