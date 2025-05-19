package agentieTurism.adapter.adapterClase.classes;

import agentieTurism.adapter.adapterClase.softInchiriereMaisni.Masina;
import agentieTurism.adapter.adapterClase.softInchiriereMaisni.MasinaInchiriata;

public class PachetMasinaInchiriata extends MasinaInchiriata implements PachetTuristic{
    public PachetMasinaInchiriata(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
