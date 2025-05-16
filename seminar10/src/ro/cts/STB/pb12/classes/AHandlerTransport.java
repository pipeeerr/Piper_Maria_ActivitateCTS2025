package ro.cts.STB.pb12.classes;

public abstract class AHandlerTransport {
    protected AHandlerTransport urmator;

    public void setUrmator(AHandlerTransport urmator) {
        this.urmator = urmator;
    }

    public abstract void recomanda(int distanta);
}
