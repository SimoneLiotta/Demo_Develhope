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
    public void calcolaArea() {
        System.out.println("L'area del " + nome + " é " + (base*altezza)/2);
    }
}
