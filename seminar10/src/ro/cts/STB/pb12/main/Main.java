package ro.cts.STB.pb12.main;

import ro.cts.STB.pb12.classes.*;

public class Main {
    public static void main(String[] args) {
        AHandlerTransport troleibuz = new HandlerTroleibuz();
        AHandlerTransport autobuz = new HandlerAutobuz();
        AHandlerTransport tramvai = new HandlerTramvai();
        AHandlerTransport metrou = new HandlerMetrou();

        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        troleibuz.recomanda(2);
        troleibuz.recomanda(5);
        troleibuz.recomanda(7);
        troleibuz.recomanda(12);
    }
}
