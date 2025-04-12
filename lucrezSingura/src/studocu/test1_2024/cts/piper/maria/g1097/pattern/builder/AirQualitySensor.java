package studocu.test1_2024.cts.piper.maria.g1097.pattern.builder;

public class AirQualitySensor implements AbstractAirQualitySensor {
    private final boolean hasPM25;
    private final boolean hasPM10;
    private final boolean hasVOC;
    private final boolean hasCO2;
    private final boolean hasCO;
    private final boolean hasHumidity;
    private final boolean hasTemperature;

    public AirQualitySensor(boolean hasPM25, boolean hasPM10, boolean hasVOC, boolean hasCO2, boolean hasCO, boolean hasHumidity, boolean hasTemperature) {
        this.hasPM25 = hasPM25;
        this.hasPM10 = hasPM10;
        this.hasVOC = hasVOC;
        this.hasCO2 = hasCO2;
        this.hasCO = hasCO;
        this.hasHumidity = hasHumidity;
        this.hasTemperature = hasTemperature;
    }

    public boolean isHasPM25() {
        return hasPM25;
    }

    public boolean isHasPM10() {
        return hasPM10;
    }

    public boolean isHasVOC() {
        return hasVOC;
    }

    public boolean isHasCO2() {
        return hasCO2;
    }

    public boolean isHasCO() {
        return hasCO;
    }

    public boolean isHasHumidity() {
        return hasHumidity;
    }

    public boolean isHasTemperature() {
        return hasTemperature;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirQualitySensor{");
        sb.append("hasPM25=").append(hasPM25);
        sb.append(", hasPM10=").append(hasPM10);
        sb.append(", hasVOC=").append(hasVOC);
        sb.append(", hasCO2=").append(hasCO2);
        sb.append(", hasCO=").append(hasCO);
        sb.append(", hasHumidity=").append(hasHumidity);
        sb.append(", hasTemperature=").append(hasTemperature);
        sb.append('}');
        return sb.toString();
    }
}
