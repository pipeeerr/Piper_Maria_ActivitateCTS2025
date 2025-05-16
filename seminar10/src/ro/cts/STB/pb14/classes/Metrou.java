package ro.cts.STB.pb14.classes;

public class Metrou extends TemplateMetrou{
    private int nrMetrou;

    public Metrou(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in Statia 1.");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in Statia 2.");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in Statia 3.");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in Statia 4.");
    }

    @Override
    public void opresteStatia5() {
        System.out.println("Metroul " + this.nrMetrou + " a oprit in Statia 5.");
    }
}
