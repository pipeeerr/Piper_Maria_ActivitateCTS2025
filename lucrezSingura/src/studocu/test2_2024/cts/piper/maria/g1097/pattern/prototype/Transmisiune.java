package studocu.test2_2024.cts.piper.maria.g1097.pattern.prototype;

import studocu.test2_2024.cts.piper.maria.g1097.pattern.factoryMethod.Sport;

import java.util.ArrayList;
import java.util.List;

public class Transmisiune implements Live {
    private String echipaGazda;
    private String echipaOaspete;
    private List<String> listaComentarii = new ArrayList<>();
    private Sport sport;

    public Transmisiune(String echipaGazda, String echipaOaspete) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
    }

    public Transmisiune(String echipaGazda, String echipaOaspete, Sport sport) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.sport = sport;
    }

    public Transmisiune() {
    }

    public void adaugaComentariu(String comentariu){
        listaComentarii.add(comentariu);
    }

    @Override
    public Live copiaza() {
        Transmisiune transmisiuneLive = new Transmisiune();
        transmisiuneLive.echipaGazda = this.echipaGazda;
        transmisiuneLive.echipaOaspete = this.echipaOaspete;
        return transmisiuneLive;
    }

    public void promo() {
        System.out.println(new StringBuilder(sport.descriere()).append(" -> Echipa Gazda: ").append(echipaGazda).append(" - Echipa Oaspete: ").append(echipaOaspete));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transmisiunea{");
        sb.append("Echipa gazda='").append(echipaGazda).append('\'');
        sb.append(", Echipa Oaspete='").append(echipaOaspete).append('\'');
        sb.append(", listaComentarii=").append(listaComentarii);
        sb.append('}');
        return sb.toString();
    }
}
