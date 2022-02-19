package org.launchcode.techjobs.oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

public class JobTest {

    Job job_one;
    Job job_two;

    @Before
    public void beforeTest() {
        job_one = new Job();
        job_two = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(job_one.equals(job_two));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assert job_fields instanceof Job;
    }


    @Test
    public void testJobsForEquality() {
        Job check_one = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job check_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(check_one.equals(check_two));
    }

    @Test
    public void testReturnBlankLines() {
        Job line_check = new Job("AA", new Employer("AA"), new Location("AA"), new PositionType("AA"), new CoreCompetency("AA"));
        assertTrue(line_check.toString().startsWith("\n"));
        assertTrue(line_check.toString().endsWith("\n"));
    }

    @Test
    public void testForFields() {
        Job field_check = new Job("AA", new Employer("AA"), new Location("AA"), new PositionType("AA"), new CoreCompetency("AA"));
        String field_checks = "\nID: " + field_check.getId() + "\nName: " + field_check.getName() + "\nEmployer: " + field_check.getEmployer() + "\nLocation: " + field_check.getLocation() + "\nPosition Type: " + field_check.getPositionType() + "\nCore Competency: " + field_check.getCoreCompetency() + "\n";
        assertEquals(field_checks, field_check.toString());
    }

    @Test
    public void testForEmpty() {
        Job empty_check = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String empty_checks = ("\nID: " + (empty_check.getId() == 0 ? "Data not available" : empty_check.getId()))
                + ("\nName: " + (empty_check.getName().equals("") ? "Data not available" : empty_check.getName()))
                + ("\nEmployer: " + (empty_check.getEmployer().equals("") ? "Data not available" : empty_check.getEmployer()))
                + ("\nLocation: " + (empty_check.getLocation().equals("") ? "Data not available" : empty_check.getLocation()))
                + ("\nPosition Type: " + (empty_check.getPositionType().equals("") ? "Data not available" : empty_check.getPositionType()))
                + ("\nCore Competency: " + (empty_check.getCoreCompetency().equals("") ? "Data not available" : empty_check.getCoreCompetency())) + "\n";
        assertEquals(empty_checks, empty_check.toString());
    }


}
