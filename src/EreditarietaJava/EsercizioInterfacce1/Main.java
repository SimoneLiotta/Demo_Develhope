package EreditarietaJava.EsercizioInterfacce1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo("rettangolo", 12, 10);
        Triangolo triangolo = new Triangolo("triangolo", 14, 9);

        System.out.println("L'area del " + rettangolo.nome + " è " + rettangolo.calcolaArea());
        System.out.println("L'area del " + triangolo.nome + " è " + triangolo.calcolaArea());
    }
}
