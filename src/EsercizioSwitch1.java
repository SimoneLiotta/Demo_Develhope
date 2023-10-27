public class EsercizioSwitch1 {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(giorno(num));
    }
    public static String giorno (int num){
        switch (num){
            case 1 : return "lunedì";
            case 2 : return "martedì";
            case 3 : return "mercoledì";
            case 4 : return "giovedì";
            case 5 : return "venerdì";
            case 6 : return "sabato";
            case 7 : return "domenica";
            default: return "errore: il numero deve essere compreso tra 1 e 7";
        }
    }
}
