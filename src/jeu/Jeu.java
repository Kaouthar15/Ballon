package jeu;

public class Jeu {


    public static void main(String[] args) {
        Ballon b = new Ballon(1);
        Joueur j1 = new Joueur("Kaouthar",b);
        Joueur j2 = new Joueur("Houda",b);
        Joueur j3 = new Joueur("Adam",b);

        j1.start();
        j2.start();
        j3.start();

    }

}
