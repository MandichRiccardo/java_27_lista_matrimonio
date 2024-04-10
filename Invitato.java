public class Invitato{
    private String nome;
    private String cognome;
    private String indirizzo;
    private boolean sposo;

    public Invitato(String nome, String cognome, String indirizzo, boolean sposo) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.sposo = sposo;
    }
    public Invitato(Invitato i) {
        this.nome = i.nome;
        this.cognome = i.cognome;
        this.indirizzo = i.indirizzo;
        this.sposo = i.sposo;
    }
    public Invitato() {
        System.out.println("inserisci il nome di questo invitato");
        this.nome = getString();
        System.out.println("inserisci il cognome di " + nome);
        this.cognome = getString();
        System.out.println("inserisci l'indirizzo di " + nome);
        this.indirizzo = getString();
        System.out.println(nome + "è stato invitato dalla sposo?");
        this.sposo = getBoolean();
    }

    public boolean invitedByBridegroom() {
        return sposo;
    }

    private static String getString() {
        return new java.util.Scanner(System.in).nextLine();
    }

    private static boolean getBoolean(){
        try{
            return new java.util.Scanner(System.in).nextBoolean();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un booleano nel formato \"true\" o \"false\"");
            return getBoolean();
        }
    }

    public boolean equals(Invitato i){
        if(!this.nome.equals(i.nome)) return false;
        if(!this.cognome.equals(i.cognome)) return false;
        return this.indirizzo.equals(i.indirizzo);
    }
}