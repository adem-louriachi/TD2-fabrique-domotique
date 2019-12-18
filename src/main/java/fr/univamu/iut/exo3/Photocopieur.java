package fr.univamu.iut.exo3;

public class Photocopieur extends DecorateurFonction{
    @Override
    public void imprimer() {
        super.imprimer();
        System.out.println("La fonction Photocopieur est activée.");
    }
}
