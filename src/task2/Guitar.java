package task2;

public class Guitar implements Instrument{

    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Plays a " + getClass().getSimpleName() + " with characteristics: " + "number of strings = " + numberOfStrings);
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
