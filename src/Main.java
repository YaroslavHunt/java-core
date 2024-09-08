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

        Post post1 = new Post(1, 101, "Post Title 1", "This is the body of post 1");
        Post post2 = new Post(2, 102, "Post Title 2", "This is the body of post 2");
        Post post3 = new Post(3, 103, "Post Title 3", "This is the body of post 3");
        Post post4 = new Post(4, 104, "Post Title 4", "This is the body of post 4");
        Post post5 = new Post(5, 105, "Post Title 5", "This is the body of post 5");

        Comment comment1 = new Comment(101, 1, "John Doe", "john@example.com", "Great post!");
        Comment comment2 = new Comment(102, 2, "Jane Smith", "jane@example.com", "Very informative.");
        Comment comment3 = new Comment(103, 3, "Bob Johnson", "bob@example.com", "I completely agree.");
        Comment comment4 = new Comment(104, 4, "Alice Davis", "alice@example.com", "Interesting perspective.");
        Comment comment5 = new Comment(105, 5, "Charlie Brown", "charlie@example.com", "Thanks for sharing!");


        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);

        for(Object o: books) {
            System.out.println(o);
        }

        for(Object o: cars) {
            System.out.println(o);
        }

        for(Object o: dogs) {
            System.out.println(o);
        }

        for(Object o: posts) {
            System.out.println(o);
        }

        for (Object o: comments) {
            System.out.println(o);
        }

    }
}