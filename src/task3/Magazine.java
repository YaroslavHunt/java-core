package task3;

public class Magazine extends Book {

    int issueNumber;


    public Magazine(String material, int age, String title, String author, int issueNumber) {
        super(material, age, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine Info:");
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
