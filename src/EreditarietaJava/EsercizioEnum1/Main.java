package EreditarietaJava.EsercizioEnum1;


//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
//        Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.


public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3, 12);
        Triangolo triangolo = new Triangolo(6,9);

        System.out.println("L'area del " + TipoForma.RETTANGOLO + " è " + rettangolo.calcolaArea());
        System.out.println("L'area del " + TipoForma.TRIANGOLO + " è " + triangolo.calcolaArea());

    }
}
