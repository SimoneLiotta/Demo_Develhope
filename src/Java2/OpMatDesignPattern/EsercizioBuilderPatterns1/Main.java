package Java2.OpMatDesignPattern.EsercizioBuilderPatterns1;

public class Main {
    public static void main(String[] args) {
        Builder builder1 = new Builder("Mario", "Rossi");

        Builder builder2 = new Builder("Luca","Verdi");
        builder2.setAge(23);

        Person persona1 = builder1.build();
        System.out.println("persona1: " + persona1);

        Person persona2 = builder2.build();
        System.out.println("persona2: " + persona2);
    }
}
