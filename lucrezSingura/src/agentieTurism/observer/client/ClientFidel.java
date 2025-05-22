package agentieTurism.observer.client;

public class ClientFidel implements Observer {
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + this.nume + " ai primit notificarea: " + mesaj);
    }
}
