package EreditarietaJava.EsercizioPolimorfismo1;

public class Triangolo extends Forma {
int base;
int altezza;
    public Triangolo(String nome, int base, int altezza) {
        super(nome);
        this.base= base;
        this.altezza=altezza;
    }

    @Override
    public double calcolaArea() {
       return (base*altezza)/2;
    }
}
