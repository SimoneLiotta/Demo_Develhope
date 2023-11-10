package Java1.BasiJava;

public class EsercizioArray1 {
    public static void main(String[] args) {
        int[] arrayInt = riempiArray();

        System.out.println("Questo è un nuovo array");

        for (int numero : arrayInt){
            System.out.println(numero);
        }
        System.out.println("La somma di tutti i numeri è: " + calcola(arrayInt));


    }
    public static int[] riempiArray (){
        int[] arrayInt = new int[10];

        for (int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = i+1;

        }
        return arrayInt;
    }

   public static int calcola (int [] arrayInt){
        int somma = 0;
        for (int numero : arrayInt){
            somma += numero;
        }
        return somma;
    }
}
