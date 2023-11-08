package EreditarietaJava.EsercizioInterfacce1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo("rettangolo", 12, 10);
        Triangolo triangolo = new Triangolo("triangolo", 14, 9);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
