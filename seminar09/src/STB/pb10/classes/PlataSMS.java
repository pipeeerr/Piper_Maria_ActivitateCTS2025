package STB.pb10.classes;

public class PlataSMS implements IMetodaPlata {
    public PlataSMS() {
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        System.out.println("Ai platit prin SMS.");
    }
}
