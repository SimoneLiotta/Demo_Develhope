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

    public void calcolaArea(){
        System.out.print("L'area del " + tipo + " è ");
    }
}
