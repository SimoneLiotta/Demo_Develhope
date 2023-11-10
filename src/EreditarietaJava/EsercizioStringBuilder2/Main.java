package EreditarietaJava.EsercizioStringBuilder2;

public class Main {
    public static void main(String[] args) {
        String testo = "Ma che bel castello marcondirondirondello";
        int index = 20;
        System.out.println(covertiInUnicode(testo,index));
    }
   public static String covertiInUnicode(String testo, int index) {

       StringBuilder risultato = new StringBuilder("Il valore Unicode del carattere in posizione " + index);

       if (index < 0 || index > testo.length()) {
           risultato.replace(0, risultato.length(), "L'indice è fuori dai limiti della stringa");
       } else {
           char carattere = testo.charAt(index);
           risultato.append(" \"" + carattere + "\" è " + Integer.toHexString(carattere));
       }
       return risultato.toString();
    }
}

//ero indeciso se togliere gli spazi dalla stringa prima di cercare il carattere, ma visto che anche lo spazio
//ha un valore unicode, l'ho lasciato cosi
