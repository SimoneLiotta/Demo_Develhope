package Java2.OpMatDesignPattern.EsercizioBuilderPatterns1;

public class Builder {
    String firstName;
    String lastName;
    int age;
    String address;
    public Builder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }
    public Builder setAddress(String address){
        this.address = address;
        return this;
    }
    public Person build(){
        return new Person(this);
    }

}
