package agentieTurism.builder.v2.classes;

import agentieTurism.builder.v2.classes.PachetVacanta;

public class PachetVacantaBuilder implements Builder {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetVacantaBuilder() {
        this.hasWiFi = false;
        this.hasAnimale = false;
        this.isFumator = false;
        this.hasAC = false;
        this.hasTV = false;
    }

    public PachetVacantaBuilder setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
        return this;
    }

    public PachetVacantaBuilder setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
        return this;
    }

    public PachetVacantaBuilder setFumator(boolean fumator) {
        isFumator = fumator;
        return this;
    }

    public PachetVacantaBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public PachetVacantaBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    @Override
    public PachetVacanta build() {
        return new PachetVacanta(hasWiFi, hasAnimale, isFumator, hasAC, hasTV);
    }
}
