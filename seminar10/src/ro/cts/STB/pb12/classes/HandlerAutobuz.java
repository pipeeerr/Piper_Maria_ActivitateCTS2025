package ro.cts.STB.pb12.classes;

public class HandlerAutobuz extends AHandlerTransport{
    @Override
    public void recomanda(int distanta) {
        if (distanta <= 5) {
            System.out.println("Se recomanda autobuzul.");
        } else if (urmator != null) {
            urmator.recomanda(distanta);
        }
    }
}
