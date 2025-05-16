package ro.cts.STB.pb14.classes;

public class MetrouSpecial extends TemplateMetrou{

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul a oprit in Statia 1.");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul a oprit in Statia 2.");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Statia 3 este in renovare.");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul a oprit in Statia 4.");
    }

    @Override
    public void opresteStatia5() {
        System.out.println("Statia 5 este in renovare.");
    }
}
