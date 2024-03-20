import java.util.Arrays;

public class Combattimento {
    private Modalità modalità;
    private Giocatore[] partecipanti;

    public Combattimento(Modalità modalità) {
        this.modalità = modalità;
        this.partecipanti = new Giocatore[3];
    }

    public void aggiungiPartecipante(Giocatore giocatore){
        Giocatore[] tempArray = new Giocatore[partecipanti.length + 1];
        for (int i = 0 ; i < partecipanti.length ; i++){
            tempArray[i]=partecipanti[i];
        }
        tempArray[tempArray.length -1]=giocatore;
        partecipanti = tempArray;

    }

    public void rimuoviPartecipante(Giocatore giocatore){
        Giocatore[] tempArray = new Giocatore[partecipanti.length - 1];
        int j = 0;
        for (int i = 0; i < partecipanti.length; i++){
            tempArray[j] = partecipanti[i];
            j++;
        }
    }

    public void attacco(Giocatore giocatore, Giocatore target){
        int result = giocatore.getPuntiAttacco() - target.getPuntiDifesa();
        target.setSalute(target.getSalute() - result);
    }

    @Override
    public String toString() {
        return "Combattimento{" +
                "modalità=" + modalità +
                ", partecipanti=" + Arrays.toString(partecipanti) +
                '}';
    }

    public Modalità getModalità() {
        return modalità;
    }

    public void setModalità(Modalità modalità) {
        this.modalità = modalità;
    }

    public Giocatore[] getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(Giocatore[] partecipanti) {
        this.partecipanti = partecipanti;
    }
}
