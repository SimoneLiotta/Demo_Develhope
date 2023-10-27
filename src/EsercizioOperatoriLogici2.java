public class EsercizioOperatoriLogici2 {
    public static void main(String[] args) {
    int num = 7;
        System.out.println(num + " è pari ? :" + controllo(num));
    }

    public static boolean controllo (int num){
        return num % 2 == 0;
    }
}
