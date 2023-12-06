package Java2.OpMatDesignPattern.EsercizioFactoryPatterns1;

public class Main {
    public static void main(String[] args) {
        ShapeType type = ShapeType.SQUARE;
        Shape shape = ShapeFactory.getShape(type);
        shape.draw();

    }
}
