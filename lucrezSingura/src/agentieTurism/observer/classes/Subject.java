package agentieTurism.observer.classes;

import agentieTurism.observer.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergerObserver(Observer observer);
    void notificaObserveri(String mesaj);
}
