package studocu.test2_2024.cts.piper.maria.g1097.pattern.factoryMethod;

public class SportMingeFactory implements SportFactory{
    @Override
    public Sport creazaSport(TipSport tip) {
        if(tip instanceof TipSportMinge tipSport) {
            return switch (tipSport) {
                case Fotbal -> new Fotbal();
                case Handbal -> new Handbal();
                case Baschet -> new Baschet();
            };
        }
        return null;
    }
}
