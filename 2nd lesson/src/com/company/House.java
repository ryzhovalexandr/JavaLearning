package com.company;

/**
 * Created by Александр on 06.11.2016.
 */
public class House {
    private int number;
    private Flat[] flats;

    public House(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public int getNumber() {
        return number;
    }

    public Flat[] getFlats() {
        return flats;
    }
}
