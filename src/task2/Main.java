package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("kiwi");
        words.add("banana");
        words.add("date");
        words.add("apple");
        words.add("elderberry");
        words.add("grape");
        words.add("mango");
        words.add("fig");
        words.add("honeydew");
        words.add("cherry");
        words.add("strawberry");
        words.add("orange");
        words.add("papaya");
        words.add("fruit");
        words.add("tangerine");
        words.add("lemon");
        words.add("watermelon");
        words.add("quince");
        words.add("nectarine");
        words.add("raspberry");

        words.sort(String::compareTo);

        for (String word : words) {
            System.out.println(word);
        }
    }
}