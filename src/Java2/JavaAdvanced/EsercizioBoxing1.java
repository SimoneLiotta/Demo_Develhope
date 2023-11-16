package Java2.JavaAdvanced;

public class EsercizioBoxing1 {
    public static void main(String[] args) {

        int risultato1 = sommaPrim(2,3);
        System.out.println(risultato1);

        Integer risultato1Autobox = risultato1;


        char risulato2 = charPrim('#');
        System.out.println(risulato2);

        Character risultato2Autobox = risulato2;


        Integer risultato3 = sommaPrim(2,6);
        System.out.println(risultato3);

        int risultato3Unbox = risultato3;


        Character risultato4 = charObj('@');
        System.out.println(risultato4);

        char risultato4Unbox = risultato4;


        double risultato5 = 3.4;
        Double risultato5Unbox = risultato5;
        double risultato5Autobox = risultato5Unbox;





    }

    public static int sommaPrim(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static char charPrim(char ch) {
        return ch;
    }

    public static Integer sommaObj(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static Character charObj(Character character) {
        return character;
    }

}
