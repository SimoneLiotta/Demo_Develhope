package EreditarietaJava.EsercizioClassiAstratte1;

public abstract class Forma {
    String nome;

    public Forma(String nome){
        this.nome = nome;

    }
    public abstract double calcolaArea();
}
