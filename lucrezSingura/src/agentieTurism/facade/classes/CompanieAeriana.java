package agentieTurism.facade.classes;

public class CompanieAeriana {
    private String nume;

    public CompanieAeriana(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Zbor rezrvaZbor(String orasPlecare, String orasDestinatie) {
        return new Zbor(this, orasPlecare, orasDestinatie);
    }
}
