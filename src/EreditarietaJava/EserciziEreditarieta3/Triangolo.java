package EreditarietaJava.EserciziEreditarieta3;

public class Triangolo extends Forma {
int base;
int altezza;
    public Triangolo(String nome, int base, int altezza) {
        super(nome);
        this.base= base;
        this.altezza=altezza;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.println((base*altezza)/2);
    }
}
