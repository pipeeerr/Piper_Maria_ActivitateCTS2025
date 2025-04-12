package restaurant.pb2.classes;

public class RezervareBuilder implements Builder {
    private String nume;
    private String data;
    private String ora;

    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public RezervareBuilder() {
        this.nume = "Anonim";
        this.data = "azi";
        this.ora = "acum";
        this.asezareLaGeam = false;
        this.scauneErgonomice = false;
        this.decorareaMesei = false;
        this.muzicaAmbientalaPersonalizata = false;
        this.genMuzica = "";
    }

    public RezervareBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public RezervareBuilder setData(String data) {
        this.data = data;
        return this;
    }

    public RezervareBuilder setOra(String ora) {
        this.ora = ora;
        return this;
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare Build() {
        return new Rezervare(nume, data, ora, asezareLaGeam, scauneErgonomice, decorareaMesei, muzicaAmbientalaPersonalizata, genMuzica);
    }
}
