package STB.pb11.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject {
    private int nrLinie;
    private List<Observer> calatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Observer calator : calatori) {
            calator.primesteMesaj(mesaj);
        }
    }
    public abstract void pleacaDeLaCapat();

    public int getNrLinie() {
        return nrLinie;
    }
}
