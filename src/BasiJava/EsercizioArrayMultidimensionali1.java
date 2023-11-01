package BasiJava;

public class EsercizioArrayMultidimensionali1 {
    public static void main(String[] args) {
    int [][] matrix = riempiMatrix();
    int sommaPrimaRiga = sommaElementiSingolaRiga(matrix[0]);

    for(int [] riga  : matrix){
        for (int elemento : riga){
            System.out.println(elemento);
        }
        System.out.println();
    }
        System.out.println("Somma elementi prima riga: " + sommaPrimaRiga);
    }
    public static int [][] riempiMatrix (){
        int [][] matrix = {{1,4,6}, {3,5,7,}};
        return matrix;
    }
    public static int sommaElementiSingolaRiga (int [] riga){
        int somma = 0;
            for(int elemento : riga){
                somma += elemento;

            }
        return somma;
    }
}
