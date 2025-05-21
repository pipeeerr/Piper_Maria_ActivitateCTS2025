package agentieTurism.flyweight.classes;

public class Optionale {
    private boolean areCina;
    private int nrExcursii;

    public Optionale(boolean areCina, int nrExcursii) {
        this.areCina = areCina;
        this.nrExcursii = nrExcursii;
    }

    public boolean isAreCina() {
        return areCina;
    }

    public void setAreCina(boolean areCina) {
        this.areCina = areCina;
    }

    public int getNrExcursii() {
        return nrExcursii;
    }

    public void setNrExcursii(int nrExcursii) {
        this.nrExcursii = nrExcursii;
    }
}
