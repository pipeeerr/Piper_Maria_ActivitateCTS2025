package agentieTurism.builder.v1.classes;

public class PachetVacantaBuilder implements Builder {
    private PachetVacanta pachetVacanta;

    public PachetVacantaBuilder() {
        this.pachetVacanta = new PachetVacanta(false, false, false, false, false);
    }

    public PachetVacantaBuilder setHasWiFi(boolean hasWiFi) {
        this.pachetVacanta.setHasWiFi(hasWiFi);
        return this;
    }

    public PachetVacantaBuilder setHasAnimale(boolean hasAnimale) {
        this.pachetVacanta.setHasAnimale(hasAnimale);
        return this;
    }

    public PachetVacantaBuilder setFumator(boolean fumator) {
        this.pachetVacanta.setFumator(fumator);
        return this;
    }

    public PachetVacantaBuilder setHasAC(boolean hasAC) {
        this.pachetVacanta.setHasAC(hasAC);
        return this;
    }

    public PachetVacantaBuilder setHasTV(boolean hasTV) {
        this.pachetVacanta.setHasTV(hasTV);
        return this;
    }

    @Override
    public PachetVacanta build() {
        return pachetVacanta;
    }
}
