package additional;

import java.util.ArrayList;

public class Post {

    private int userId;

    private int id;

    private String title;

    private String body;

    private ArrayList<Comment> comments;

    public Post() {}

    public Post(int userId, int id, String title, String body, ArrayList<Comment> comments) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = comments;
    }

    public int getUserId() {
        return userId;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\tPost{" +
                "userId=" + userId +
                "\nid=" + id +
                "\ntitle='" + title + '\'' +
                "\nbody='" + body + '\'' +
                "\n\tcomments=" + comments +
                '}';
    }

}
