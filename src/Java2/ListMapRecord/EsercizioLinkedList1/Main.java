package Java2.ListMapRecord.EsercizioLinkedList1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Fragola"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Lampone"));
        fruitList.add(new Fruit("Pera"));

        System.out.println(fruitList);

        fruitList.add(0, new Fruit("Mela"));
        fruitList.add(fruitList.size(), new Fruit("Melone"));

        System.out.println(fruitList);


    }
}
