package task3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Car {

    private String brand;

    private int enginePower;

    private Owner owner;

    private int price;

    private int year;
}
