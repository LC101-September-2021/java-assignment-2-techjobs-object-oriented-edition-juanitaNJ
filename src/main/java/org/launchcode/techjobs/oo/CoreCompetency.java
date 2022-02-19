package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.tests.JobField;

import java.util.Objects;

public class CoreCompetency extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency(String value) {
        super(value);
    }

}
