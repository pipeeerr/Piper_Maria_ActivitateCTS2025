package ro.cts.pb4.classes;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Necunoscut";
        }

        if(nrPersoane >= 2) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 2;
        }

        if(data.length() == 8) {
            this.data = data;
        } else {
            this.data = "01.01.25";
        }
        this.ora = ora;
    }

    public ARezervare() {
        this.numeClient = "Anonim";
        this.nrPersoane = 2;
        this.data = "01.01.25";
        this.ora = "00:00";
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public abstract void descriere();

    public abstract ARezervare copiaza();
}
