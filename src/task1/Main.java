package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<Printable>();
        printables.add(new Book());
        printables.add(new Magazine(1));
    }
}