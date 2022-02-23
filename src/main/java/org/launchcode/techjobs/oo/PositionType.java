package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType(String value) {
        super(value);
    }

}
