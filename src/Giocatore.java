import java.util.Arrays;

public class Giocatore {
    private String nome;
    private float posizioneX;
    private float posizioneY;
    private int salute;
    private int puntiAttacco;
    private int puntiDifesa;
    private String[] inventario;
    private Razza razza;

    public Giocatore(String nome, float posizioneX, float posizioneY, int salute, int puntiAttacco, int puntiDifesa, String[] inventario, Razza razza) {
        this.nome = nome;
        this.posizioneX = posizioneX;
        this.posizioneY = posizioneY;
        this.salute = salute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.inventario = inventario;
        this.razza = razza;
    }

    public Giocatore(String nome, float posizioneX, float posizioneY, int salute, int puntiAttacco, int puntiDifesa) {
        this.nome = nome;
        this.posizioneX = posizioneX;
        this.posizioneY = posizioneY;
        this.salute = salute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
    }

    public void muovi(float posizioneX, float posizioneY) {
        setPosizioneX(posizioneX);
        setPosizioneY(posizioneY);
    }

    public void colpisci(Giocatore target) {
        int result = puntiAttacco - target.puntiDifesa;
        target.setSalute(target.salute - result);
        System.out.println("Salute rimanente:" + target.getSalute());
    }

    public void status(Giocatore giocatore1){
        System.out.println("Nome: " + giocatore1.getNome() + " X: " + giocatore1.getPosizioneX() + " Y: " + giocatore1.getPosizioneY() + " Salute: " + giocatore1.getSalute() + " Punti attacco: " +
                giocatore1.getPuntiAttacco() + " Punti difesa: " + giocatore1.getPuntiDifesa() + " Inventario: " + Arrays.toString(giocatore1.getInventario()));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPosizioneX() {
        return posizioneX;
    }

    public void setPosizioneX(float posizioneX) {
        this.posizioneX = posizioneX;
    }

    public float getPosizioneY() {
        return posizioneY;
    }

    public void setPosizioneY(float posizioneY) {
        this.posizioneY = posizioneY;
    }

    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    public String[] getInventario() {
        return inventario;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public Razza getRazza() {
        return razza;
    }

    public void setRazza(Razza razza) {
        this.razza = razza;
    }
}
