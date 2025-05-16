package ro.cts.STB.pb12.classes;

public class HandlerTroleibuz extends AHandlerTransport{
    @Override
    public void recomanda(int distanta) {
        if(distanta < 0) {
            System.out.println("Distanta trebuie sa fie mai mare decat 0.");
        } else {
            if (distanta <= 3) {
                System.out.println("Se recomanda troleibuzul");
            } else if (urmator != null) {
                urmator.recomanda(distanta);
            }
        }
    }
}
