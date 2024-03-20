//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Giocatore personaggio1 = new Giocatore("Gandalf", 0.1f, 0.1f, 10, 9,4);
        Giocatore personaggio2 = new Giocatore("Gimli",5.0f,5.0f,15,5,5);
        Giocatore personaggio3 = new Giocatore("Legolas",6.0f,6.0f,6,7,3);
        Giocatore personaggio4 = new Giocatore("Boromir",7.0f,7.0f,12,6,2);
        Combattimento combattimento1 = new Combattimento(Modalità.ONEVSONE);

        combattimento1.aggiungiPartecipante(personaggio1);
        combattimento1.aggiungiPartecipante(personaggio2);
        System.out.println(combattimento1);




        personaggio2.status(personaggio2);
        combattimento1.attacco(personaggio1, personaggio2);
        personaggio2.status(personaggio2);




    }
}