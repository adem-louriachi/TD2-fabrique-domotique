package fr.univamu.iut.exo1;

public class Radio implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("Bravo, tu as connecté ta radio à " + gadget + " ! (Qui utilise encore une radio de nos jours ??)");
    };
}
