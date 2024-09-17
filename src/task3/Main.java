package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 150, new Owner("John", 28, 3), 10000, 2015));
        cars.add(new Car("Honda", 180, new Owner("Alice", 30, 6), 12000, 2016));
        cars.add(new Car("BMW", 250, new Owner("Mike", 26, 2), 25000, 2018));
        cars.add(new Car("Audi", 220, new Owner("Sara", 35, 10), 22000, 2017));
        cars.add(new Car("Ford", 140, new Owner("Tom", 24, 4), 9000, 2014));
        cars.add(new Car("Nissan", 170, new Owner("Anna", 27, 1), 11000, 2019));
        cars.add(new Car("Mazda", 160, new Owner("James", 29, 5), 15000, 2020));

        System.out.println("Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності): \n");

        List<Car> powerCars = cars.stream()
                .limit(cars.size() / 2)
                .peek(car -> car.setEnginePower((int) (car.getEnginePower() * 1.1)))
                .toList();

        System.out.println(powerCars.stream().map(Car::toString).collect(Collectors.joining("\n")));

        System.out.println("\nЯкщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.: \n");

        cars.stream()
                .map(Car::getOwner)
                .filter(owner -> owner.getDrivingExperience() < 5 && owner.getAge() > 25)
                .forEach(owner -> owner.setDrivingExperience(owner.getDrivingExperience() + 1));

        System.out.println(cars.stream().map(Car::toString).collect(Collectors.joining("\n")));

        System.out.println("\nСума, яку потрібно потратити для покупки всіх цих авто: " );

        int totalCost = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();

        System.out.print(totalCost);
    }
}
