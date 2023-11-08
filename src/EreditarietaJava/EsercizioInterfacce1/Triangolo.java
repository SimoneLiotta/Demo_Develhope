package EreditarietaJava.EsercizioInterfacce1;

public class Triangolo implements Forma{

    String nome;
    int base;
    int altezza;

    public Triangolo (String nome, int base, int altezza){
        this.nome = nome;
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return (base*altezza)/2 ;
    }
}
