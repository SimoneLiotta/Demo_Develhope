package EreditarietaJava.EsercizioEnum1;



public class Rettangolo extends Forma {

    int base;
    int altezza;



    public Rettangolo(int base, int altezza, TipoForma tipo){

        super(tipo);
        this.base=base;
        this.altezza=altezza;
    }


    public double calcolaArea() {
        return base*altezza;

    }
}
