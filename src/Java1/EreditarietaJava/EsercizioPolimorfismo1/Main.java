package Java1.EreditarietaJava.EsercizioPolimorfismo1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo("rettangolo", 3, 12);
        Triangolo triangolo = new Triangolo("triangolo", 6,9);

        System.out.println("L'area del " + rettangolo.nome + " è " + rettangolo.calcolaArea());
        System.out.println("L'area del " + triangolo.nome + " è " + triangolo.calcolaArea());


    }
}
