package Java1.BasiJava;

public class EsercizioArrayMultidimensionali2 {
    public static void main(String[] args) {
        //creiamo una matrice iniziale e la riempiamo col metodo riempiMatrix
        int[][] matriceIniziale = riempiMatrix();
        System.out.println("Matrice Iniziale");
        stampaMatrice(matriceIniziale);
        //creiamo la matrice finale e la riempiamo col metodo inverti matrice, perche dobbiamo invertire righe e colonne della matrice creata
        int[][] matriceFinale = invertiMatrice(matriceIniziale);
        System.out.println("Matrice Finale");
        stampaMatrice(matriceFinale);
    }

    public static int[][] riempiMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        return matrix;
    }

    public static int[][] invertiMatrice(int[][] matriceIniziale) {
        //su due variabili ci troviamo quante righe e quante colonne per ogni riga ha la nostra matrice iniziale
        int riga = matriceIniziale.length;
        int colonna = matriceIniziale[0].length;
        //la nostra matrice finale la inizializziamo scrivendo che per righe avrà il numero di colonne della matrice iniziale, e per colonne avrà il numero di righe
        int[][] matriceFinale = new int[colonna][riga];
        // scorriamo con un for prima le righe e poi le colonne della nostra matrice
        for (int i = 0; i < riga; i++) {
            for (int j = 0; j < colonna; j++) {
                //assegniamo alla matrice finale i valori invertiti della matrice iniziale
                matriceFinale[j][i] = matriceIniziale[i][j];
            }
        }

        return matriceFinale;
    }

    // questo è un semplice metodo che scorre un matrice e la stampa, che richiamo nel metodo main inserendo come argomento la matrice che voglio stampare
    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}

