class DocumentFactory {
    public Document createDocument(String type, String title, String author, Object extraInfo) {
        switch (type.toLowerCase()) {
            case "report":
                return new Report(title, author, (String) extraInfo);

            case "invoice":
                return new Invoice(title, author, (Double) extraInfo);
            default:
                throw new IllegalArgumentException("Unknown document type");
        }
    }
}
