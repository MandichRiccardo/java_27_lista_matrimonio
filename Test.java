public class Test{
    public static void main(String[] args) {
        boolean running = true;
        List listaNozze = new List(), invitatiDalloSposo = new List(), invitatiDallaSposa = new List();
        while (running){
            System.out.println("stato della lista generale\n" + listaNozze);
            System.out.println("stato della lista degli invitati dallo sposo\n" + invitatiDalloSposo);
            System.out.println("stato della lista degli invitati dalla sposa\n" + invitatiDallaSposa);
            System.out.println("""
                    cosa vuoi fare?
                    \t0)\tterminare il programma
                    \t1)\taggiungere un invitato alla lista generale
                    \t2)\trimuovere  un invitato alla lista generale
                    \t3)\tmettere la lista generica in ordine alfabetico
                    \t4)\tsmistare la lista generica nelle due liste
                    \t\t(una con le persone invitate dallo sposo e una con quelle invitate della sposa)""");
            switch (getInt()){
                default -> running = false;
                case 1 -> listaNozze.addNode(new Node());
                case 2 -> listaNozze.removeNode(new Node());
                case 3 -> listaNozze.order();
                case 4 -> listaNozze.smista(invitatiDalloSposo, invitatiDallaSposa);
            }
        }
        System.out.println("programma terminato");
    }

    public static int getInt(){
        try{
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero intero");
            return getInt();
        }
    }
}