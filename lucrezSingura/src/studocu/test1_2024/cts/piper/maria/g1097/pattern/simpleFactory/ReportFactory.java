package studocu.test1_2024.cts.piper.maria.g1097.pattern.simpleFactory;

public class ReportFactory {
    private static final int freshAirValue = 31;
    private static final int warningValue = 71;
    public AbstractAirQualityReport createReport(float pmValue) {
        if (pmValue < freshAirValue) {
            return new FreshAirReport();
        } else if (pmValue < warningValue) {
            return new WarningReport();
        } else {
            return new HealthRiskReport();
        }
    }
}
