package task2;

public class Drum implements Instrument {

    private int size;

    @Override
    public void play() {
        System.out.println("Plays a " + getClass().getSimpleName() + " with characteristics: " + "size = " + size);
    }

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
