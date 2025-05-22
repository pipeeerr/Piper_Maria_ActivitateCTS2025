package agentieTurism.observer.main;

import agentieTurism.observer.classes.Agentie;
import agentieTurism.observer.classes.Subject;
import agentieTurism.observer.client.ClientFidel;
import agentieTurism.observer.client.Observer;

public class Main {
    public static void main(String[] args) {
        Observer clientAndrei = new ClientFidel("Andrei");
        Observer clientMaria = new ClientFidel("Maria");
        Observer clientPetru = new ClientFidel("Petru");

        Subject agentie = new Agentie("Sephora");
        agentie.adaugaObserver(clientMaria);
        agentie.adaugaObserver(clientPetru);
        ((Agentie)agentie).notificaOfertaNoua();
        agentie.adaugaObserver(clientAndrei);
        ((Agentie)agentie).notificaReducerePret();
    }
}
