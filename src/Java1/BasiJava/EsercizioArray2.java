package Java1.BasiJava;

public class EsercizioArray2 {
    public static void main(String[] args) {
        char [] arrayChar = riempiArray();
        System.out.println("Contenuto dell'array");
        for (char carattere : arrayChar){
            System.out.println(carattere);
        }
        System.out.println("Ci sono " + contaCarattere(arrayChar) + " occorrenze del carattere 'a'");
    }
    public static char [] riempiArray (){
        char [] arrayChar = {'a', 'b', 'c', 'a', '?', '$', 'a'};
        return arrayChar;
        }
        public static int contaCarattere (char [] arrayChar){
        int count = 0;
        for (char carattere : arrayChar){
            if(carattere == 'a'){
                count += 1;
            }
        }
            return count;

        }

    }

