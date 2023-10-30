import java.util.Arrays;
public class EsercizioArray3 {
    public static void main(String[] args) {
        int[] arrayInt = riempiArray();
        int[] newArray = eliminaDuplicati(arrayInt);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(newArray));
    }

    //riempio il mio arrayInt con un ciclo for da 1 a 15 e poi sostituisco manualmente alcuni valori, inserendoli duplicati
    public static int[] riempiArray() {
        int[] arrayInt = new int[15];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }

        arrayInt[10] = 2;
        arrayInt[11] = 5;
        arrayInt[12] = 7;
        arrayInt[13] = 9;
        arrayInt[14] = 1;

        return arrayInt;
    }
    public static int[] eliminaDuplicati(int[] arrayInt) {
        //scorro tutto l'array e conto con la variabile numNonDuplicati, quanti sono i numeri totali, esclusi quelli ripetuti
        int numNonDuplicati = 0;
        //scorro ogni valore del mio arrayInt
        for (int i = 0; i<arrayInt.length; i++) {
            //setto una variabile booleana su false che mi indica se il valore è o non è duplicato
            boolean duplicato = false;
            // scorro nuovamente il mio arrayInt
            for (int j = 0; j < i; j++) {
                //se un valore trovato scorrendo l'array con i è uguale ad un valore scorrendo l'array con j allora è un duplicato, la mia variabile duplicato si setta su true e il progrmma si interrompe
                if (arrayInt[i] == arrayInt[j]) {
                    duplicato = true;
                    break;

                }
            }
            // se invece non è un numero duplicato allora la mia variabile numNonDuplicati incrementa di +1
            if (!duplicato) {
                numNonDuplicati++;
            }
        }
        //inizializzo un nuovo array chiamato appunto newArray di lunghezza uguale alla mia variabile numNonDuplicati dopo che avrà appunto finito di contare quanti sono i numeri non duplicati
        int[] newArray = new int[numNonDuplicati];
        //creo una variabile per indicare l'indice del mio newArray e la imposto su 0, quindi la prima posizione dell'array
        int nuovoIndice = 0;
        //scorro tutto il mio array iniziale arrayInt
        for (int i : arrayInt) {
            // faccio lo stesso controllo di prima, quindi setto una variabile booleana su false per vedere se il numero è o non è duplicato
            boolean duplicato = false;
            // sta volta il mio secondo for controllerà se dentro il nuovo array newArray esiste gia il valore del mio arrayInt
            for (int j = 0; j < nuovoIndice; j++) {
                // se esiste gia allora è duplicato quindi si interrompe
                if (i == newArray[j]) {
                    duplicato = true;
                    break;
                }
            }
            //se il numero non è duplicato, lo inserisce nel mio newArray in posizione nuovoIndice e incrementa nuovoIndice di +1 per andare a riempire la posizione successiva
            if (!duplicato) {
                newArray[nuovoIndice] = i;
                nuovoIndice++;
            }
        }
        return newArray;
    }
}
