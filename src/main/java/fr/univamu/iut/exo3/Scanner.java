package fr.univamu.iut.exo3;

public class Scanner extends DecorateurFonction{
    public Scanner(Fax photocopieur) {
        super();
    }

    @Override
    public void imprimer() {
        super.imprimer();
        System.out.println("La fonction Scanner est activée.");
    }
}
