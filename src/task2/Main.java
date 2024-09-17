package task2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 25, 4, 5, 6, 3, 0, 9, 10,
                11, 12, 21, 14, 94, 16, 17, 2, 19, 20};

        System.out.println("------------------------------------SORTED-----------------------------------------------");
        IntStream sortedStream = Arrays.stream(numbers);
        sortedStream.sorted().forEach(System.out::println);

        System.out.println("-------------------------------DIVISIBLE BY 3--------------------------------------------");
        IntStream divisibleBy3Stream = Arrays.stream(numbers);
        divisibleBy3Stream.filter(num -> num % 3 == 0).sorted().forEach(System.out::println);

        System.out.println("-------------------------------DIVISIBLE BY 10-------------------------------------------");
        IntStream divisibleBy10Stream = Arrays.stream(numbers);
        divisibleBy10Stream.filter(num -> num % 10 == 0).sorted().forEach(System.out::println);

        System.out.println("-----------------------------------NUM x 3-----------------------------------------------");
        IntStream x3Numbers = Arrays.stream(numbers);
        x3Numbers.map(num -> num * 3).forEach(System.out::println);


    }
}
