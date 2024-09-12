package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(7);
        Drum drum = new Drum(30);
        Tube tube = new Tube(5);

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(tube);

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }
}