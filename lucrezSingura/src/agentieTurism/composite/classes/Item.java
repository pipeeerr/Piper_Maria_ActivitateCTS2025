package agentieTurism.composite.classes;

public class Item implements Optiune {
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("Aceasta metoda nu este implementata.");
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("Aceasta metoda nu este implementata.");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Aceasta metoda nu este implementata.");
    }

    @Override
    public void descriere() {
        System.out.println("    Item: " + this.nume);
    }
}
