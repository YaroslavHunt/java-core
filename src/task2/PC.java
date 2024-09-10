package task2;

public class PC extends Workstation {

    private String monitor;

    private String mouse;

    private String keyboard;

    public PC(int ramSize, int storageSize, String brand, String monitor, String mouse, String keyboard) {
        super(ramSize, storageSize, brand);
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}
