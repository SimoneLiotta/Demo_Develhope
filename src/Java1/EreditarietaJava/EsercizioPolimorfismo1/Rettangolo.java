package Java1.EreditarietaJava.EsercizioPolimorfismo1;

public class Rettangolo extends Forma {

    int base;
    int altezza;

    public Rettangolo( String nome, int base, int altezza){
        super(nome);
        this.base=base;
        this.altezza=altezza;
    }

       @Override
    public double calcolaArea() {

        return base*altezza;

    }
}
