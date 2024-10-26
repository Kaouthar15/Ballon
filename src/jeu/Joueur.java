package jeu;


public class Joueur  extends Thread {
    private String name;
    private Ballon ballon;

    @Override
    public String toString() {
        return name;
    }

    public Joueur(String name, Ballon ballon) {
        this.name = name;
        this.ballon = ballon;
    }

    public void run(){
       while(true){

               ballon.receive_release(this);

       }

    }


}
