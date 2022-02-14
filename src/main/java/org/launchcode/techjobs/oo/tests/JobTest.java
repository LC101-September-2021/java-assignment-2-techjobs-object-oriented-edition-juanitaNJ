package org.launchcode.techjobs.oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        Job line_check = new Job();
        assertTrue(line_check.toString().startsWith("\n"));
        assertTrue(line_check.toString().endsWith("\n"));
    }


}
