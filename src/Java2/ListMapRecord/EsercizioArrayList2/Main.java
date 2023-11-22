package Java2.ListMapRecord.EsercizioArrayList2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();

        lista.add(new Student("Marco", 18));
        lista.add(new Student("Giulia", 35));
        lista.add(new Student("Anna", 23));
        lista.add(new Student("Aldo", 28));
        lista.add(new Student("Giovanna", 21));
        lista.add(new Student("Marzia", 28));
        lista.add(new Student("Simone", 34));
        lista.add(new Student("Mattia", 33));
        lista.add(new Student("Sofia", 15));
        lista.add(new Student("Eleonora", 17));
        lista.add(new Student("Azzurra", 23));
        lista.add(new Student("Christian", 33));

        System.out.println(lista);

//        Collections.sort(lista, Comparator.comparing(Student::getName)); ordinati in ordine alfabetico
        Collections.sort(lista, Comparator.comparingInt(Student::getAge)); // ordinati per età
        System.out.println(lista);


    }
}
