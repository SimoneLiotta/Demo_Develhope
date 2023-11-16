package Java2.JavaAdvanced;

public class EsercizioExceptions3 {
    public static void main(String[] args) {
        dividi(3);
    }

    public static void dividi(int num) {
        try {
            int risultato = num / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
