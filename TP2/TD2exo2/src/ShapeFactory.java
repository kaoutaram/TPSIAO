class ShapeFactory {
    // Méthode pour créer des instances de formes en fonction du type
    public Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "carré":
                return new Square();
            case "cercle":
                return new Circle();
            case "triangle":
                return new Triangle();

            default:
                throw new IllegalArgumentException("Type de forme inconnu : " + type);
        }
    }
}
