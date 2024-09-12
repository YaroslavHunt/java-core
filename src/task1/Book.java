package task1;

public class Book implements Printable {

    private String title;

    private String author;

    private int pages;

    private String content;

    @Override
    public void print() {
        System.out.println("Printing Book");
    }

    public Book() {}

    public Book(String title, String author, int pages, String content) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
