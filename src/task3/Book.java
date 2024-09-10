package task3;

public class Book extends Papyrus{

    String title;

    String author;

    public Book(String material, int age, String title, String author) {
        super(material, age);
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

}
