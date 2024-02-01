package Java2.OpMatDesignPattern.EsercizioFactoryPatterns1;

public class Circle implements Shape{

double raggio;

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.pow(raggio,2)*Math.PI;
    }
}

