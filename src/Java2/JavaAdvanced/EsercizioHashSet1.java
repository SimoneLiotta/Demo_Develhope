package Java2.JavaAdvanced;

import java.util.HashSet;

public class EsercizioHashSet1 {
    public static void main(String[] args) {
        HashSet<String> frutta = creaHashset();
        System.out.println("La grandezza dell'HashSet è: " + frutta.size());

        for (String e : frutta) {
            System.out.println(e);
        }
    }

    public static HashSet<String> creaHashset() {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("mela");
        hashSet.add("pera");
        hashSet.add("ciliegia");
        hashSet.add("banana");
        return hashSet;
    }
}
