package STB.pb10.classes;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if (nrCalatoriiRamase > 0) {
            System.out.println("Ai platit cu cardul de calatorii.");
            nrCalatoriiRamase--;
            return;
        }
        System.out.println("Nu mai ai calatorii ramase.");
    }
}
