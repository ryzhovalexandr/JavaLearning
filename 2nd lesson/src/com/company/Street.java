package com.company;

/**
 * Created by Александр on 06.11.2016.
 */
public class Street {
    private String name;
    private House[] houses;

    public Street(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return this.name;
    }

    public House[] getHouses() {
        return houses;
    }
}
