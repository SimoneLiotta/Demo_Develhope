package EreditarietaJava.EsercizioEnum1;


public class Triangolo extends Forma {
int base;
int altezza;
    public Triangolo(int base, int altezza) {


        this.base= base;
        this.altezza=altezza;
        super.setTipo(TipoForma.TRIANGOLO);
    }

    @Override
    public double calcolaArea() {

        return (base*altezza)/2 ;
    }
}
