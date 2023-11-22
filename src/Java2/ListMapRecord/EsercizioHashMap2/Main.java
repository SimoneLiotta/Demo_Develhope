package Java2.ListMapRecord.EsercizioHashMap2;


import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Car> carMap = new HashMap<>();
        carMap.put("Auto1", new Car("Mazda", "CX3", 130));
        carMap.put("Auto2", new Car("Audi", "Q8", 180));
        carMap.put("Auto3", new Car("Peugeot", "2008", 120));
        carMap.put("Auto4", new Car("Ford", "Mustang", 280));

//        System.out.println(carMap);
        System.out.println("Auto in ordine di inserimento");
        carMap.forEach((keys,values) ->System.out.println(keys + "=" + values));
        System.out.println();

        List<Car> alfabeticBrandList = new ArrayList<>(carMap.values());

        //ordine alfabetico in base al brand
        Collections.sort(alfabeticBrandList, Comparator.comparing(Car::getBrand));
        System.out.println("Auto ordinate per brand");
        alfabeticBrandList.forEach(System.out::println);
        System.out.println();

        //ordine crescente dei cv
        Collections.sort(alfabeticBrandList, Comparator.comparingInt(Car::getCv));
        System.out.println("Auto ordinate per cv");
        alfabeticBrandList.forEach(System.out::println);

        //ho provato a lasciare le keys anche dopo l'ordinamento ma non riesco a stamparle, magari poi mi fai vederecome si fa



    }
}
