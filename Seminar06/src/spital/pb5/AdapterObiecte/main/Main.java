package spital.pb5.AdapterObiecte.main;

import spital.pb5.AdapterObiecte.classes.AdapterMedicament;
import spital.pb5.AdapterObiecte.classes.MedicamentFarmacie;
import spital.pb5.AdapterObiecte.classes.MedicamentSpital;

public class Main {
    public static void vindeMedicamnete(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va ofera medicamentul:");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Paracetamol", true);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie(200, "Nurofen", false);

        vindeMedicamnete(medicamentFarmacie);
        vindeMedicamnete(medicamentFarmacie1);

        MedicamentSpital medicamentSpital = new MedicamentSpital(150, "Parasinus");
        MedicamentSpital medicamentSpital1 = new MedicamentSpital(220, "Sirop de tuse");

        vindeMedicamnete(new AdapterMedicament(medicamentSpital));
        vindeMedicamnete(new AdapterMedicament(medicamentSpital1));
    }
}
