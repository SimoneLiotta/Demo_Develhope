package Java2.OpMatDesignPattern.EsercizioSingletonPatterns1;

public class User {
    private static User user;
    private String name;
    private int age;

    public static User getInstance(){
        if (user==null){
            user = new User();
            user.name="Default name";
            user.age = 0;
        }
        return user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printData (){
        System.out.println("Nome: " + name);
        System.out.println("Età: " + age);
    }
}
