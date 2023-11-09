package EreditarietaJava.EsercizioStringBuilder1;

public class Main {
    public static void main(String[] args) {
        String testo1 = "abracadabra, simsalbim, bibidibobidibu";
        String testo2 = "non esattamente quello di prima";
        String risultato = comparaStringhe(testo1, testo2);
        System.out.println(risultato);


    }

    public static String comparaStringhe(String testo1, String testo2) {
        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");
        if (testo1.equals(testo2)) {
            risultato.append("uguali");
        } else {
            risultato.append("diverse");
        }
        return risultato.toString();
    }
}
