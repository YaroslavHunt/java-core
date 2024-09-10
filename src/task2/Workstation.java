package task2;

public class Workstation {

    private String brand;

    private String motherBoard;

    private String processor;

    private String ram;

    private int ramSize;

    private String videoCard;

    private String psu;

    private String cdRom;

    private String hdd;

    private int storageSize;

    private String operationSystem;

    public final void start() {
        System.out.println("Starting work...");
    }

    public final void stop() {
        System.out.println("Stop work");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Motherboard: " + motherBoard);
        System.out.println("Processor: " + processor);
        System.out.println("Video card: " + videoCard);
        System.out.println("RAM size: " + ramSize + "GB");
        System.out.println("Storage size: " + storageSize + "GB");
    }

    public Workstation() {}

    public Workstation(int ramSize, int storageSize, String brand) {
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.brand = brand;
    }

    public Workstation(String brand, String motherBoard, String processor, String ram, int ramSize, String videoCard, String psu, String cdRom, String hdd, int storageSize, String operationSystem) {
        this.brand = brand;
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.ram = ram;
        this.ramSize = ramSize;
        this.videoCard = videoCard;
        this.psu = psu;
        this.cdRom = cdRom;
        this.hdd = hdd;
        this.storageSize = storageSize;
        this.operationSystem = operationSystem;
    }
}
