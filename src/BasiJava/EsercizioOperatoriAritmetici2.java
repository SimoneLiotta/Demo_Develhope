package BasiJava;

public class EsercizioOperatoriAritmetici2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 8;

        System.out.println(calcolaMedia(x,y,z));
    }

    public static int calcolaMedia (int x,int y,int z){
        return (x+y+z)/3;
    }
}
