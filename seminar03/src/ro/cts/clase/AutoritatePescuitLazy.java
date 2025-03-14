package ro.cts.clase;

public class AutoritatePescuitLazy {
    private String denumire;
    private String webSite;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitLazy instance = null;
    private AutoritatePescuitLazy(String denumire, String webSite, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.webSite = webSite;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static synchronized AutoritatePescuitLazy getInstance(String denumire, String webSite, int nrAngajati, int nrAutorizatiiEmise) {
        if(instance == null){
            instance = new AutoritatePescuitLazy(denumire, webSite, nrAngajati, nrAutorizatiiEmise);
        }
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void angajeaza(int nrAngajati) {
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(int nrAngajati) {
        this.nrAngajati -= nrAngajati;
    }

    public void emiteAutorizatie(String numePersoana) {
        System.out.println(new StringBuilder("A fost emisa autorizatie pentru ").append(numePersoana).toString());
        nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", webSite='").append(webSite).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
