package spital.pb5.AdapterClase.classes;

public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie{
    public AdapterMedicament(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
