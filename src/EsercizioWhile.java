public class EsercizioWhile {
    public static void main(String[] args) {

        int num = 4;


        System.out.println("La somma di tutti i numeri da 0 a " + num + " è:" + calcolaSomma(num));

        }
    public static int calcolaSomma (int num) {
        int i = 0;
        int sum = 0;
        while (i < num) {
            i++;
            sum += i;
        }
        return sum;
    }

}
