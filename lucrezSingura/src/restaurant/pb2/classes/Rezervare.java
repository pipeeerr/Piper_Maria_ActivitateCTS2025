package restaurant.pb2.classes;

public class Rezervare {
    private String nume;
    private String data;
    private String ora;

    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public Rezervare(String nume, String data, String ora, boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientalaPersonalizata, String genMuzica) {
        this.nume = nume;
        this.data = data;
        this.ora = ora;
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
