package Java2.JavaAdvanced;

import Java2.JavaAdvanced.EsercizioHashSet2.Frutto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EsercizioHashSet3 {
    public static void main(String[] args) {
        Set<String> hashSet = creaHashset();
        System.out.println(hashSet);

        String string = new String("ciao");
        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            String el = iterator.next();
            if (el.equals(string)){
                iterator.remove();
            }
        }
        System.out.println(hashSet);

    //svuoto l'hashste e lo ristampo vuoto
       hashSet.clear();

       System.out.println(hashSet);

    }
    public static Set<String> creaHashset() {

        Set<String> hashSet = new HashSet<>(Arrays.asList("ciao", "come", "stai"));

        return hashSet;
    }
}
