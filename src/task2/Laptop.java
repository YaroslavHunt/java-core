package task2;

public class Laptop extends Workstation{

    private String model;

    private String display;;

    private String touchpad;

    private String keyboard;

    public void open() {
        System.out.println("Hello");
    }

    public void close() {
        stop();
    }

    public Laptop(int ramSize, int storageSize, String brand, String model, String display, String touchpad, String keyboard) {
        super(ramSize, storageSize, brand);
        this.model = model;
        this.display = display;
        this.touchpad = touchpad;
        this.keyboard = keyboard;
    }
}
