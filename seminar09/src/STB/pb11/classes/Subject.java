package STB.pb11.classes;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String mesaj);
}
