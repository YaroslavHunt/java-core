import additional.Comment;
import additional.Post;
import task4.Car;
import task4.GENDER;
import task4.Skill;
import task4.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));

        Car toyota = new Car("toyota", 2021, 250);

        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, GENDER.MALE, skills, toyota);

//        System.out.println(user);

        //--------------------------------------------------------------------------------------------------------------

        ArrayList<Comment> comments1 = new ArrayList<>();
        ArrayList<Comment> comments2 = new ArrayList<>();
        ArrayList<Comment> comments3 = new ArrayList<>();

        Post post1 = new Post(1, 1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum" +
                        "\nreprehenderit molestiae ut ut quas totam" +
                        "\nnostrum rerum est autem sunt rem eveniet architecto", comments1);

        Post post2 = new Post(1, 2, "qui est esse", "est rerum tempore vitae" +
                "\nsequi sint nihil reprehenderit dolor beatae ea dolores neque" +
                "\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis" +
                "\nqui aperiam non debitis possimus qui neque nisi nulla", comments2);

        Post post3 = new Post(1,3, "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad" +
                        "\nvoluptatem doloribus vel accusantium quis pariatur" +
                        "\nmolestiae porro eius odio et labore et velit aut", comments3);

        Comment comment1 = new Comment(post1.getId(), 1, "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos" +
                        "\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");

        Comment comment2 = new Comment(post1.getId(), 2, "quo vero reiciendis velit similique earum",
                "Jayne_Kuhic@sydney.com",
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at" +
                        "\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");

        Comment comment3= new Comment(post1.getId(), 3, "odio adipisci rerum aut animi",
                "Nikita@garfield.biz",
                "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium" +
                        "\nomnis quibusdam delectus saepe quia accusamus maiores nam est" +
                        "\ncum et ducimus et vero voluptates excepturi deleniti ratione");

        comments1.add(comment3);
        comments1.add(comment1);
        comments1.add(comment2);

        System.out.println(post1);
    }
}