package studocu.test1_2024.cts.piper.maria.g1097.pattern.builder;

public class SensorBuilder implements Builder{
    private boolean hasPM25;
    private boolean hasPM10;
    private boolean hasVOC;
    private boolean hasCO2;
    private boolean hasCO;
    private boolean hasHumidity;
    private boolean hasTemperature;

    public SensorBuilder() {
        setAllAttributesToFalse();
    }

    public SensorBuilder setHasPM25(boolean hasPM25) {
        this.hasPM25 = hasPM25;
        return this;
    }

    public SensorBuilder setHasPM10(boolean hasPM10) {
        this.hasPM10 = hasPM10;
        return this;
    }

    public SensorBuilder setHasVOC(boolean hasVOC) {
        this.hasVOC = hasVOC;
        return this;
    }

    public SensorBuilder setHasCO2(boolean hasCO2) {
        this.hasCO2 = hasCO2;
        return this;
    }

    public SensorBuilder setHasCO(boolean hasCO) {
        this.hasCO = hasCO;
        return this;
    }

    public SensorBuilder setHasHumidity(boolean hasHumidity) {
        this.hasHumidity = hasHumidity;
        return this;
    }

    public SensorBuilder setHasTemperature(boolean hasTemperature) {
        this.hasTemperature = hasTemperature;
        return this;
    }

    private void setAllAttributesToFalse() {
        this.hasPM25 = false;
        this.hasPM10 = false;
        this.hasVOC = false;
        this.hasCO2 = false;
        this.hasCO = false;
        this.hasHumidity = false;
        this.hasTemperature = false;
    }

    @Override
    public AbstractAirQualitySensor build() {
        AbstractAirQualitySensor instance =  new AirQualitySensor(hasPM25, hasPM10, hasVOC, hasCO2, hasCO, hasHumidity, hasTemperature);
        setAllAttributesToFalse();
        return instance;
    }
}
