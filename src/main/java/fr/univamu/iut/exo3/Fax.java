package fr.univamu.iut.exo3;

public class Fax extends DecorateurFonction{
    public Fax(ImprimanteLocale imprimanteLocale) {
        super();
    }

    @Override
    public void imprimer() {
        super.imprimer();
        System.out.println("La fonction Fax est activée.");
    }
}
