package EreditarietaJava.EsercizioPolimorfismo1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo("rettangolo", 3, 12);
        Triangolo triangolo = new Triangolo("triangolo", 6,9);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();

    }
}
