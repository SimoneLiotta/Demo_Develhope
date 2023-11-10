package Java1.EreditarietaJava.EsercizioEnum1;



public class Rettangolo extends Forma {

    int base;
    int altezza;



    public Rettangolo(int base, int altezza){


        this.base=base;
        this.altezza=altezza;
        super.setTipo(TipoForma.RETTANGOLO);
    }


    public double calcolaArea() {
        return base*altezza;

    }
}
