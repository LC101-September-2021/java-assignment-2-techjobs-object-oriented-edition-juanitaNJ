package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.tests.JobField;

import java.util.Objects;

public class Location extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public Location(String value) {
        super(value);
    }

}
