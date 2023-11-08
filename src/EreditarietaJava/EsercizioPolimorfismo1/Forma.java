package EreditarietaJava.EsercizioPolimorfismo1;

public class Forma {
    String nome;

    public Forma(String nome){
        this.nome = nome;

    }
    public void calcolaArea(){
        System.out.print("L'area del " + nome + " é ");
    }
}
