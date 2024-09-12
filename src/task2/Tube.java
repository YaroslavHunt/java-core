package task2;

public class Tube implements Instrument {

    private double diameter;

    @Override
    public void play() {
        System.out.println("Plays a " + getClass().getSimpleName() + " with characteristics: " + "diameter = " + diameter);
    }

    public Tube(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
