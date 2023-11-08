package EreditarietaJava.EsercizioEreditarieta1;

public class Gatto extends Animale {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void faIlVerso() {
        super.faIlVerso();
        System.out.println("miao");
    }
}
