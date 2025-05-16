package ro.cts.STB.pb12.classes;

public class HandlerTramvai extends AHandlerTransport{
    @Override
    public void recomanda(int distanta) {
        if (distanta <= 10) {
            System.out.println("Se recomanda tramvaiul.");
        } else if (urmator != null) {
            urmator.recomanda(distanta);
        }
    }
}
