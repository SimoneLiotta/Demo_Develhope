public class EsercizioOperatoriAssegnazioni {

    //è lo stesso di "EsercizioOperatoriAritmetici3" dato che l'avevo gia mandato a video!
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println(increMolt(x,y));
    }

    public static int increMolt (int x, int y){
        x += 2;
        y += 3;

        return x*y;

    }
}
