public class EsercizioSwitch2 {
    public static void main(String[] args) {
    char carattere = '-';
        System.out.println(tipo(carattere));
    }

    public static String tipo (char carattere){
        switch (carattere){
            case '+': return "addizione";
            case '-': return "sottrazione";
            case '*': return "moltiplicazione";
            case '/': return "divisione";
            default: return "errore: non è un simbolo aritmetico";
        }
    }
}
