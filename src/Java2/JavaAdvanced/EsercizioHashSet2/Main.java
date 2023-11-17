package Java2.JavaAdvanced.EsercizioHashSet2;


import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Frutto frutto = new Frutto("mela");

        Set<Frutto> frutta = creaHashset(frutto);
        if (frutta.contains(frutto)){
            System.out.println("Il frutto è contenuto nel set");
        } else {
            System.out.println("Il frutto non è contenuto nel set");
        }

    }
    public static Set<Frutto> creaHashset(Frutto frutto) {

        Set<Frutto> hashSet = new HashSet<>();
        hashSet.add(frutto);
        hashSet.add(new Frutto("banana"));
        hashSet.add(new Frutto("ciliegia"));
        hashSet.add(new Frutto("pera"));
        return hashSet;
    }


}
