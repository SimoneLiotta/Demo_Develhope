package Java2.OpMatDesignPattern.EsercizioFactoryPatterns1;

public class ShapeFactory {
    public  Shape getShape(ShapeType type){

        Shape shape = switch (type){
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
            case RECTANGLE -> new Rectangle();
            default -> null;
        };
        return shape;
    }
}
