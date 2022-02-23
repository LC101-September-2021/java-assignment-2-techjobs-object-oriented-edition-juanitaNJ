package org.launchcode.techjobs.oo;

public class Location extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public Location(String value) {
        super(value);
    }

}
