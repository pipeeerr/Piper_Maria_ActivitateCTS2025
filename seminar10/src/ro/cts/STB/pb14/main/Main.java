package ro.cts.STB.pb14.main;

import ro.cts.STB.pb14.classes.Metrou;
import ro.cts.STB.pb14.classes.MetrouSpecial;
import ro.cts.STB.pb14.classes.TemplateMetrou;

public class Main {
    public static void main(String[] args) {
        TemplateMetrou metrouNormal = new Metrou(7);
        TemplateMetrou metrouSpecial = new MetrouSpecial();

        metrouNormal.circulaTur();
        metrouNormal.circulaRetur();

        metrouSpecial.circulaTur();
        metrouSpecial.circulaRetur();
    }
}
