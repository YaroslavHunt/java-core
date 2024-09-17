package task3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Owner {

    private String name;

    private int age;

    private int drivingExperience;

}
