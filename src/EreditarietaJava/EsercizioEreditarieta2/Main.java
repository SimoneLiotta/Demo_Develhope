package EreditarietaJava.EsercizioEreditarieta2;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo("rettangolo", 3, 12);

        System.out.println("L'area del " + rettangolo.nome + " è " + rettangolo.calcolaArea());
    }
}
