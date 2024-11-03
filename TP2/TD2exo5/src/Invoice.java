class Invoice extends Document {
    private double amount;

    public Invoice(String title, String author, double amount) {
        super(title, author);
        this.amount = amount;
    }

    @Override
    public Document clone() {
        return new Invoice(this.title, this.author, this.amount);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", amount=" + amount +
                '}';
    }
}
