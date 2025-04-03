package spital.pb5.AdapterClase.main;

import spital.pb5.AdapterClase.classes.AdapterMedicament;
import spital.pb5.AdapterClase.classes.Farmacie;
import spital.pb5.AdapterClase.classes.IMedicamentFarmacie;
import spital.pb5.AdapterClase.classes.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Paracetamol", true);
        farmacie.vindeMedicamnete(medicamentFarmacie);

        //MedicamentSpital medicamentSpital=new MedicamentSpital(19, "Nurofen");
        AdapterMedicament adapterDeClase = new AdapterMedicament(19, "Nurofen");
        farmacie.vindeMedicamnete(adapterDeClase);
    }
}
