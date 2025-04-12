package studocu.test2_2024.cts.piper.maria.g1097.main;

import studocu.test2_2024.cts.piper.maria.g1097.pattern.factoryMethod.SportFactory;
import studocu.test2_2024.cts.piper.maria.g1097.pattern.factoryMethod.SportMingeFactory;
import studocu.test2_2024.cts.piper.maria.g1097.pattern.factoryMethod.TipSportMinge;
import studocu.test2_2024.cts.piper.maria.g1097.pattern.prototype.Transmisiune;
import studocu.test2_2024.cts.piper.maria.g1097.pattern.prototype.Live;

public class Main {
    public static void main(String[] args) {
        Live youtube = new Transmisiune("FCSB", "Dinamo");
        ((Transmisiune)youtube).adaugaComentariu("BINEEEE");

        Live twitch = youtube.copiaza();
        ((Transmisiune)twitch).adaugaComentariu("YEEEEE");

        Live discord = youtube.copiaza();
        ((Transmisiune)discord).adaugaComentariu("Hai FCSB!!");

        System.out.println(youtube.toString());
        System.out.println(twitch.toString());
        System.out.println(discord.toString());

        SportFactory factory = new SportMingeFactory();

        Transmisiune transmisiune1 = new Transmisiune("Bucuresti", "Sofia", factory.creazaSport(TipSportMinge.Fotbal));
        Transmisiune transmisiune2 = new Transmisiune("Paris", "New York", factory.creazaSport(TipSportMinge.Baschet));
        Transmisiune transmisiune3 = new Transmisiune("Barcelona", "Praga", factory.creazaSport(TipSportMinge.Handbal));

        transmisiune1.promo();
        transmisiune2.promo();
        transmisiune3.promo();
    }
}
