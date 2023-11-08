package EreditarietaJava.EsercizioEnum1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3, 12, TipoForma.rettangolo);
        Triangolo triangolo = new Triangolo(6,9, TipoForma.triangolo);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();

    }
}
