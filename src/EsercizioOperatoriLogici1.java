public class EsercizioOperatoriLogici1 {
    public static void main(String[] args) {
        int estremo1 = 1;
        int estremo2 = 15;
        int valoreConfronto = 7;

        System.out.println("Il valore di confronto " + valoreConfronto + " è compreso tra i due estremi " + estremo1 + " e " + estremo2 + "?: " + compreso(estremo1, estremo2, valoreConfronto));
    }

    public static boolean compreso(int estremo1, int estremo2, int valoreConfronto) {
        return estremo1 < valoreConfronto && valoreConfronto < estremo2;
    }
}
