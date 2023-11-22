package Java2.ListMapRecord.EsercizioHashMap1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Metodo1
        Map<String, Car> carMap1 = new HashMap<>();
        carMap1.put("Auto1", new Car("Mazda", "CX3", 130));
        carMap1.put("Auto2", new Car("Audi", "Q8", 180));
        carMap1.put("Auto3", new Car("Peugeot", "2008", 120));
        carMap1.put("Auto4", new Car("Ford", "Mustang", 280));
        System.out.println("carMap1" + carMap1);

        //Metodo2
        Map<String, Car> carMap2 = Map.of("Auto1", new Car("Mazda", "CX3", 130), "Auto2", new Car("Audi", "Q8", 180), "Auto3", new Car("Peugeot", "2008", 120), "Auto4", new Car("Ford", "Mustang", 280));
        System.out.println("carMap2" + carMap2);

        //Metodo3
        Map<String,Car> carMap3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Auto1", new Car("Mazda", "CX3", 130)),
                new AbstractMap.SimpleEntry<>("Auto2", new Car("Audi", "Q8", 180)),
                new AbstractMap.SimpleEntry<>("Auto3", new Car("Peugeot", "2008", 120)),
                new AbstractMap.SimpleEntry<>("Auto4", new Car("Ford", "Mustang", 280))
                );
        System.out.println("carMap3" + carMap3);


    }
}
