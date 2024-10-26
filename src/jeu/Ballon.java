package jeu;

public class Ballon {
    private int number;
    public int getNumber() {
        return number;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public synchronized void receive_release(Joueur J)  {
        System.out.println("\n"+J+" receive the ball");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(J+" release the ball");
    }


    public Ballon(int num){
        this.number = num;
    }
}
