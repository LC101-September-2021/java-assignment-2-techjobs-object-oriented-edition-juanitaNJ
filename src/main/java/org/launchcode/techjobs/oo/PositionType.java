package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.tests.JobField;

import java.util.Objects;

public class PositionType extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType(String value) {
        super(value);
    }

}
