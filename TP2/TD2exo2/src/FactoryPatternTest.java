public class FactoryPatternTest {
    public static void main(String[] args) {
        // Instanciation de ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Création de différentes formes
        Shape square = shapeFactory.createShape("carré");
        Shape circle = shapeFactory.createShape("cercle");
        Shape triangle = shapeFactory.createShape("triangle");


        // Dessin des formes
        square.draw();
        circle.draw();
        triangle.draw();

    }
}
