package studocu.test1_2024.cts.piper.maria.g1097.main;

import studocu.test1_2024.cts.piper.maria.g1097.pattern.builder.AbstractAirQualitySensor;
import studocu.test1_2024.cts.piper.maria.g1097.pattern.builder.SensorBuilder;
import studocu.test1_2024.cts.piper.maria.g1097.pattern.simpleFactory.AbstractAirQualityReport;
import studocu.test1_2024.cts.piper.maria.g1097.pattern.simpleFactory.ReportFactory;

public class Main {
    public static void main(String[] args) {
        ReportFactory factory = new ReportFactory();
        AbstractAirQualityReport report = factory.createReport(29);
        report.descriere();

        report = factory.createReport(75);
        report.descriere();

        report = factory.createReport(61);
        report.descriere();

        SensorBuilder sensorBuilder = new SensorBuilder();
        AbstractAirQualitySensor sensor1 = sensorBuilder.setHasHumidity(true).build();
        AbstractAirQualitySensor sensor2 = sensorBuilder.setHasCO(true).setHasTemperature(true).build();
        AbstractAirQualitySensor sensor3 = sensorBuilder.setHasCO2(true).setHasPM25(true).setHasPM10(true).build();

        System.out.println(sensor1);
        System.out.println(sensor2);
        System.out.println(sensor3);
    }
}
