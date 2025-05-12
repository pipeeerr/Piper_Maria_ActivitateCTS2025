package STB.pb11.classes;

public class Autobuz extends MijlocTransport {
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        super.trimiteMesaj("Autobuzul cu numaeul " + this.getNrLinie() + " a plecat de la capat");
    }

    public void schimbaTraseul() {
        trimiteMesaj("Autobuzul cu numarul " + this.getNrLinie() + " va circula astazi prin Bd. Balcescu si nu va mai opri la statia Piata Romana.");
    }
}
