package EreditarietaJava.EsercizioEnum1;

enum TipoForma{
    triangolo,
    rettangolo,
}
public class Forma {
    TipoForma tipo;
    public  Forma(TipoForma tipo){
        this.tipo = tipo;
    }

    public double calcolaArea(){
        return 0;
    }
}
