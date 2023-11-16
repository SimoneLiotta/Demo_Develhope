package Java2.JavaAdvanced;
public class EsercizioNullability1 {
    public static void main(String[] args) {
        try {
            System.out.println(divisione(3.4,7.8));
            System.out.println(divisione(null, 6.2));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static double divisione(Double numeratore, Double denominatore){
        if (numeratore == null || denominatore == null){
            throw new ArithmeticException("Errore:il numeratore o il denominatore sono null");
        } else {
            return numeratore/denominatore;
        }
    }
}
