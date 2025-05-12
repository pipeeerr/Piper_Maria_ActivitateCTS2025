package STB.pb10.classes;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata = new CardBancar(10);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet) {
        metodaPlata.realizeazaPlata(pretBilet);
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
}
