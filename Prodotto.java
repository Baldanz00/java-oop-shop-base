import java.util.Random;
public class Prodotto {
    //attributi 
    //uso private e no public perchè almeno non possono essere modificati fuori dalla classe (principio di incapsulamento)
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva; 

    //costruttore:
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice= generaCodice();
        this.nome=nome;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.iva= iva;
    }
    //generare un codice random
    private int generaCodice() {
        Random random= new Random();
        return random.nextInt(90000) + 10000 //mi genera un codice casuale tra 10000 e 99999
    }
    //inserisco un metodo GETTER perchè ho usato il private. Il getter mi permette di accedere al valore degli attributi private
    public int getCodice() {
        return codice;
    }
    public String getNome(){
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public double getIva() {
        return iva;
    }

    //metodo per ottenere il prezzo base del prodotto
    public double getPrezzoBase() {
        return prezzo;
    }
    //metodo per ottenere il prezzo con iva
    public getPrezzoConIva() {
        return prezzo + (prezzo * iva/100);
    }
    //metodo per il nome
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }
    //debug
    public String toString() {
        return getNomeEsteso() + "|" + descrizione + "| Prezzo Base: €" + prezzo + "| Prezzo con Iva: €" + getPrezzoConIva(); 
    }
}

