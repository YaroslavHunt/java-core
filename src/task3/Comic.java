package task3;

public class Comic extends Book {

    String illustrator;

    String genre;

    public Comic(String material, int age, String title, String author, String illustrator, String genre) {
        super(material, age, title, author);
        this.illustrator = illustrator;
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Comic Info:");
        super.displayInfo();
        System.out.println("Illustrator: " + illustrator);
        System.out.println("Genre: " + genre);
    }
}

