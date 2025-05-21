package agentieTurism.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {
    private String nume;
    private List<Optiune> optiuni;

    public Categorie(String nume) {
        this.nume = nume;
        optiuni = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        optiuni.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        optiuni.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return optiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + this.nume + ":");
        for(Optiune optiune:optiuni) {
            optiune.descriere();
        }
    }
}
