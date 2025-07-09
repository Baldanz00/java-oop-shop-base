public class Main {
    public static void main(String[]args) {
        //prodotto
        Prodotto prodotto1= new Prodotto("Orologio" , "orologio con cinturino in pelle" , 56.99 , 22.0);

        //stampa informazioni sul prodotto:
        System.out.println("Codice: " + prodotto1.getCodice());
        System.out.println("Nome: " + prodotto1.getNome());
        System.out.println("Descrizione: " + prodotto1.getDescrizione());
        System.out.println("Prezzo base: " + prodotto1.getPrezzoBase());
        System.out.println("Prezzo con Iva: " + prodotto1.getPrezzoConIva());
        System.out.println("Nome esteso del prodotto: " + prodotto1.getNomeEsteso());
    
        System.out.println("\nInfo complete:");
        System.out.println(prodotto1);
   }
}
