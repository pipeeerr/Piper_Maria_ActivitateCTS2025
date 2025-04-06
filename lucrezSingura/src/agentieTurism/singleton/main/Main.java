package agentieTurism.singleton.main;

import agentieTurism.singleton.eagerInitialization.AgentieEager;

public class Main {
    public static void main(String[] args) {
        AgentieEager agentieEager = AgentieEager.getInstanta();
        System.out.println(agentieEager);

        AgentieEager agentieEager1 = AgentieEager.getInstanta();
        agentieEager1.setNume("Alt nume");

        System.out.println(agentieEager);
    }
}
