package Java2.OpMatDesignPattern.EsercizioFactoryPatterns1;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Rectangle rectangle = (Rectangle) shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.setAltezza(12);
        rectangle.setBase(3);
        System.out.println(rectangle.calcolaArea());

    }
}
