package task3;

public abstract class Papyrus {

    private final String material;

    private final int age;

    public Papyrus(String material, int age) {
        this.material = material;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Material: " + material);
        System.out.println("Age: " + age + " years");
    }
}
