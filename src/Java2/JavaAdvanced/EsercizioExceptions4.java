package Java2.JavaAdvanced;

public class EsercizioExceptions4 {
    public static void main(String[] args) {
        try {
            System.out.println(dividiArray(5,2));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    public static int dividiArray(int index, int num){
        int [] numeri = {2,4,6,8,10};
        if (num == 0 || index>numeri.length-1) {
            throw new ArithmeticException("Errore");
        } else {
            return numeri[index]/num;
        }
    }
}
