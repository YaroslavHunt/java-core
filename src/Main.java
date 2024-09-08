import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", 180, new String[]{"F. Scott Fitzgerald"}, "Fiction");
        Book book2 = new Book("War and Peace", 1225, new String[]{"Leo Tolstoy"}, "Historical Fiction");
        Book book3 = new Book("1984", 328, new String[]{"George Orwell"}, "Dystopian");
        Book book4 = new Book("The Hobbit", 310, new String[]{"J.R.R. Tolkien"}, "Fantasy");
        Book book5 = new Book("Crime and Punishment", 671, new String[]{"Fyodor Dostoevsky"}, "Psychological Fiction");

        Car car1 = new Car("Tesla Model S", 1020, 0, "No");
        Car car2 = new Car("BMW M5", 600, 4, "Yes");
        Car car3 = new Car("Audi RS6", 591, 4, "Yes");
        Car car4 = new Car("Toyota Supra", 335, 3, "Yes");
        Car car5 = new Car("Ford Mustang", 450, 5, "No");

        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Bella", 5, "Bulldog");
        Dog dog3 = new Dog("Charlie", 2, "Beagle");
        Dog dog4 = new Dog("Max", 4, "German Shepherd");
        Dog dog5 = new Dog("Lucy", 1, "Poodle");

        ArrayList<Book> books = new ArrayList();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        ArrayList<Car> cars = new ArrayList();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        ArrayList<Dog> dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        for(Object o: books) {
            System.out.println(o);
        }

        for(Object o: cars) {
            System.out.println(o);
        }

        for(Object o: dogs) {
            System.out.println(o);
        }

    }
}