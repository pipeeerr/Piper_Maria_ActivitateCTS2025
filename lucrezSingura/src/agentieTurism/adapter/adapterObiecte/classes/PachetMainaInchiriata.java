package agentieTurism.adapter.adapterObiecte.classes;

import agentieTurism.adapter.adapterObiecte.softInchiriereMasini.MasinaInchiriata;

public class PachetMainaInchiriata implements PachetTuristic {
    private MasinaInchiriata masina;

    public PachetMainaInchiriata(MasinaInchiriata masina) {
        this.masina = masina;
    }

    @Override
    public void descriere() {
        System.out.println(masina.toString());
    }

    @Override
    public void rezervaPachet() {
        masina.inchiriazaMasina();
    }
}
