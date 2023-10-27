public class EsercizioIfElse2 {
    public static void main(String[] args) {
        String word = "supercalifragili";
        if (word.length()<10){
            System.out.println("Lunghezza minore di 10");
        } else if (word.length()==10) {
            System.out.println("Lunghezza uguale a 10");
        } else {
            System.out.println("Lunghezza maggiore di 10");
        }
    }
}
