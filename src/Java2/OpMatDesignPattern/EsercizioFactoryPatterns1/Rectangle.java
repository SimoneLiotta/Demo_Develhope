package Java2.OpMatDesignPattern.EsercizioFactoryPatterns1;

public class Rectangle implements Shape{

    int base;
    int altezza;

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base*altezza;
    }
}
