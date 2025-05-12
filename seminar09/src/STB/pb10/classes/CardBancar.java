package STB.pb10.classes;

public class CardBancar implements IMetodaPlata {
    private double sold;

    public CardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if (sold >= pretBilet) {
            System.out.println("Ai platit cu cardul bancar.");
            sold -= pretBilet;
            return;
        }
        System.out.println("Sold insuficient.");
    }
}
