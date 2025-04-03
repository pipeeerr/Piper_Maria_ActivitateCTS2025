package spital.pb5.AdapterObiecte.classes;

public class AdapterMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(float pret, String nume, boolean esteInStoc) {
        super(pret, nume, esteInStoc);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getPret(), medicamentSpital.getNume(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
