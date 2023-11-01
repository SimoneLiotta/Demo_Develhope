package BasiJava;

public class EsercizioWhile {
    public static void main(String[] args) {

        int num = 5;


        System.out.println("La somma di tutti i numeri da 1 a " + num + " è:" + calcolaSomma(num));

        }
    public static int calcolaSomma (int num) {
        int i = 0;
        int sum = 0;
        while (i < num) {

            sum += i;
            i++;

        }
        return sum;
    }

}
