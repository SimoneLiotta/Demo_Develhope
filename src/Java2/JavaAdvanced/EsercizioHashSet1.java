package Java2.JavaAdvanced;

import java.util.HashSet;
import java.util.Set;

public class EsercizioHashSet1 {
    public static void main(String[] args) {
        Set<String> frutta = creaHashset();
        System.out.println("La grandezza dell'HashSet è: " + frutta.size());

        for (String e : frutta) {
            System.out.println(e);
        }
    }

    public static Set<String> creaHashset() {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("mela");
        hashSet.add("pera");
        hashSet.add("ciliegia");
        hashSet.add("banana");
        return (HashSet<String>) hashSet;
    }
}
