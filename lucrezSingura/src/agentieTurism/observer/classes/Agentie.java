package agentieTurism.observer.classes;

import agentieTurism.observer.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {
    private String nume;
    private List<Observer> observers;

    public Agentie(String nume) {
        this.nume = nume;
        observers = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void stergerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (Observer observer : observers) {
            observer.primesteNotificare(mesaj);
        }
    }

    public void notificaOfertaNoua() {
        notificaObserveri("A fost adaugata o noua oferta. Consultati noul nostru catalog!");
    }

    public void notificaReducerePret() {
        notificaObserveri("Preturile au fost reduse. Consultati noul nostru catalog!");
    }
}
