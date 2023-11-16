package Java2.JavaAdvanced;

public class EsercizioExceptions4 {
    public static void main(String[] args) {
        dividiArray(5);
    }

    public static void dividiArray(int index) {
        int[] numeri = {2, 4, 6, 8, 10};

        try {
            int risultato1 = numeri[index] / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException er) {
            System.out.println("ArrayIndexOutOfBoundsException: " + er.getMessage());
        }
    }
}
