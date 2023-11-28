package Java2.DateTesting.EsercizioTesting1;

public class Main {
    public static void main(String[] args) {

        System.out.println(isInRange(null,1,5));

    }
    public static Boolean isInRange(Integer value, Integer min, Integer max) {
        if (value==null || max==null || min==null){
            return null;
        } else {
            return min < value && value < max;
        }

    }
}
