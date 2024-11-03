class Report extends Document {
    private String content;

    public Report(String title, String author, String content) {
        super(title, author);
        this.content = content;
    }

    @Override
    public Document clone() {
        return new Report(this.title, this.author, this.content);
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
