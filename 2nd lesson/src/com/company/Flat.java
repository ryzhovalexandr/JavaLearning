package com.company;

/**
 * Created by Александр on 06.11.2016.
 */
public class Flat {
    private int number;

    private int peopleCount;

    public Flat(int number, int peopleCount) {
        this.number = number;
        this.peopleCount = peopleCount;
    }

    public int getNumber() {
        return number;
    }

    public int getPeopleCount() {
        return peopleCount;
    }
}
