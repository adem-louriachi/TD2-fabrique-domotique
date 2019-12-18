package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Connectable;
import sun.tools.java.ClassNotFound;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.String;

public class  AppliDomotique {
    public static String main(String[] args) {
        abstract class FabAbsConnectable {
            public Connectable fabriquer(String s)throws ClassNotFound, ClassCastException{
                Connectable c = creer(s);
                //c.equiper(c);
                return c;
            }
            public abstract Connectable creer (String s)throws ClassCastException, ClassNotFound; //faire un switch
            public abstract void equiper (Connectable c);
        }
        public static String menu(){
            String nomClasse = new String();
            System.out.println("fin");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
                nomClasse = in.readLine();
            }
            catch(IOException e) {}
            return nomClasse;
        }
        public static void connecter (String nomClasse) {
            try {
                Connectable c = fab.fabriquer(nomClasse);
            objets.add(c);
            System.out.println(c);
            }
            catch (ClassNotFound e) {}
    }
}
