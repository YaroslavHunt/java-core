package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("pear");
        words.add("grape");
        words.add("pineapple");
        words.add("orange");
        words.add("peach");
        words.add("strawberry");
        words.add("cherry");
        words.add("plum");
        words.add("apricot");
        words.add("raspberry");
        words.add("blackberry");
        words.add("melon");
        words.add("watermelon");
        words.add("mango");
        words.add("kiwi");
        words.add("lime");
        words.add("lemon");
        words.add("blueberry");

        System.out.println("------------------------------------SORTED-----------------------------------------------");
        words.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------------------WORD LENGTH > 4---------------------------------------------");
        words.stream()
                .filter(word -> word.length() > 4)
                .forEach(System.out::println);

    }
}