package Java2.OpMatDesignPattern.EsercizioSingletonPatterns1;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Mario", 23);
        User user2 = new User("Luca", 30);

        System.out.println("Dati default User1");
        user1.printData();

        System.out.println("Dati cambiati User2");
        user2.setName("Anna");
        user2.setAge(19);
        user2.printData();

    }
}
