package Java2.JavaAdvanced;

public class EsercizioExceptions2 {
    public static void main(String[] args) throws Exception {

        checkIfNumber('e');
    }
    public static void checkIfNumber(char c) throws Exception {

        if (Character.isDigit(c)) {
            System.out.println("is number");
        } else{
            throw new Exception("not number");
        }
    }
}




