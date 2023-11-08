package EreditarietaJava.EsercizioInterfacce1;

public class Rettangolo implements Forma{

    String nome;
    int base;
    int altezza;

    public Rettangolo (String nome, int base, int altezza){
        this.nome = nome;
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del " + nome + " é " + base*altezza);
    }
}
