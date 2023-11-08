package EreditarietaJava.EsercizioEnum1;


public class Triangolo extends Forma {
int base;
int altezza;
    public Triangolo(int base, int altezza, TipoForma tipo) {

        super(tipo);
        this.base= base;
        this.altezza=altezza;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.print((base*altezza)/2);
    }
}
