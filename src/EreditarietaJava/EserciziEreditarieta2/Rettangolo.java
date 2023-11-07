package EreditarietaJava.EserciziEreditarieta2;

public class Rettangolo extends Forma{

    int base;
    int altezza;

    public Rettangolo( String nome, int base, int altezza){
        super(nome);
        this.base=base;
        this.altezza=altezza;
    }

       @Override
    public void calcolaArea() {
    super.calcolaArea();
        System.out.println(base*altezza);

    }
}
