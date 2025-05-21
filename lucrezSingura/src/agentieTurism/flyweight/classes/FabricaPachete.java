package agentieTurism.flyweight.classes;

import java.util.HashMap;

public class FabricaPachete {
    private HashMap<Integer, IPachetTuristic> pacheteTuristice;

    public FabricaPachete() {
        this.pacheteTuristice = new HashMap<>();
    }

    public int getNrPachete() {
        return pacheteTuristice.size();
    }

    public IPachetTuristic getPachet(int codPachet) {
        IPachetTuristic pachetTuristic = pacheteTuristice.get(codPachet);

        if(pachetTuristic == null) {
            pachetTuristic = new PachetTuristic(codPachet, "Hotel Maria", "Bucuresti", true);
            pacheteTuristice.put(codPachet, pachetTuristic);
        }

        return pachetTuristic;
    }
}
