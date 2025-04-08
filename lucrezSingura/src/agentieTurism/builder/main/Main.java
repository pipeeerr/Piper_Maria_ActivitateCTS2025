package agentieTurism.builder.main;

import agentieTurism.builder.v1.classes.Builder;
import agentieTurism.builder.v1.classes.PachetVacanta;
import agentieTurism.builder.v1.classes.PachetVacantaBuilder;

public class Main {
    public static void main(String[] args) {
        PachetVacanta pachetV1 = new PachetVacantaBuilder().setHasTV(true).build();
        System.out.println(pachetV1.toString());

        agentieTurism.builder.v2.classes.PachetVacanta pachetV2 = new agentieTurism.builder.v2.classes.PachetVacantaBuilder().setFumator(true).build();
        System.out.println(pachetV2.toString());
    }
}
