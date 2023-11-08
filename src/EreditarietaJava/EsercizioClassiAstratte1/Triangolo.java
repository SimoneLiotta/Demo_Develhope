package EreditarietaJava.EsercizioClassiAstratte1;

public class Triangolo extends Forma {
int base;
int altezza;
    public Triangolo(String nome, int base, int altezza) {
        super(nome);
        this.base= base;
        this.altezza=altezza;
    }

    @Override
    public void calcolaArea() {

        System.out.println("L'area del " + nome + " è " + (base*altezza)/2);
    }
}
