package Java2.JavaAdvanced;

public class EsercizioExceptions3 {
    public static void main(String[] args) {
        try {
            System.out.println(dividi(0));
        } catch (ArithmeticException e){

            System.out.println(e.getMessage());

        }
    }
    public static int dividi(int num){
        if (num== 0){
            throw new ArithmeticException("Non si può dividere per 0");
        } else {
            return 10/num;
        }
    }
}
