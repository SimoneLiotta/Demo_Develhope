package Java2.ListMapRecord.EsercizioArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<Student>(Arrays.asList(new Student("Lisa", 24), new Student("Giorgio", 19)));
        System.out.println(lista);
        lista.add(new Student("Marco", 18));
        lista.add(new Student("Giulia", 35));
        lista.add(new Student("Anna", 23));
        lista.add(new Student("Aldo", 28));
        System.out.println(lista);

    }
}
