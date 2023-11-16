package Java2.JavaAdvanced;

public class EsercizioExceptions1 {
    public static void main(String[] args) throws Exception {

        System.out.println(isInRange(16,0,12));

    }
    public static boolean isInRange(int value, int min, int max) throws Exception {
        if (min<value&&value<max){
            return true;
        } else {
             throw new Exception("Il numero non è nel range");
        }

    }
}


