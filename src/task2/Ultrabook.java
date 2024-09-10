package task2;

public class Ultrabook extends Laptop {

    private double weight;

    private double displaySize;

    public Ultrabook(int ramSize, int storageSize, String brand, String model, String display, String touchpad, String keyboard, double weight, double displaySize) {
        super(ramSize, storageSize, brand, model, display, touchpad, keyboard);
        this.weight = weight;
        this.displaySize = displaySize;
    }
}
