package agentieTurism.builder.v3.classes;

import agentieTurism.builder.v2.classes.PachetVacantaBuilder;

public class PachetVacanta {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    private PachetVacanta(PachetVacantaBuilder builder) {
        this.hasWiFi = builder.hasWiFi;
        this.hasAnimale = builder.hasAnimale;
        this.isFumator = builder.isFumator;
        this.hasAC = builder.hasAC;
        this.hasTV = builder.hasTV;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetVacanta{");
        sb.append("hasWiFi=").append(hasWiFi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }

    public static class PachetVacantaBuilder implements Builder {
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
            return new PachetVacanta(this);
        }
    }
}
