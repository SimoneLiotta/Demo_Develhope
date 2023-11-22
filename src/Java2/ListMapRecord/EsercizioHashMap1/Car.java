package Java2.ListMapRecord.EsercizioHashMap1;

public class Car {
    private String brand;
    private String model;
    private int cv;

    public Car(String brand, String model, int cv){
        this.brand=brand;
        this.model=model;
        this.cv=cv;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cv=" + cv +
                '}';
    }
}
