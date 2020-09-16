package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    //creates test jobs to check ID
    Job test_job1;
    Job test_job2;
    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
    }

    //tests that JobIDs are set and are different.
    @Test
    public void testSettingJobId() {
        assertFalse(test_job1 == test_job2);

    }

    //tests that all fields are filled and properly assigned.
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(test_fullJob.getEmployer());
        assertTrue(test_fullJob.getEmployer() instanceof Employer);
        assertTrue(test_fullJob.getLocation() instanceof Location);
        assertTrue(test_fullJob.getPositionType() instanceof PositionType);
        assertTrue(test_fullJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("ACME", test_fullJob.getEmployer().toString());
        assertEquals("Product tester", test_fullJob.getName());
        assertEquals("Desert", test_fullJob.getLocation().toString());
        assertEquals("Quality control", test_fullJob.getPositionType().toString());
        assertEquals("Persistence", test_fullJob.getCoreCompetency().toString());
    }

    //creates test jobs to ensure that they are not equal even though they share the same aspects except ID.
    Job allTestJob1;
    Job allTestJob2;
    @Before
    public void createSimilarJobObjects() {
        allTestJob1 = new Job("Ice Cream Maker", new Employer("Oberweis"), new Location("Saint Louis"), new PositionType("Scooper"),new CoreCompetency("Stacker"));
        allTestJob2 = new Job("Ice Cream Maker", new Employer("Oberweis"), new Location("Saint Louis"), new PositionType("Scooper"),new CoreCompetency("Stacker"));
    }

    @Test
    public void testJobsForEquality() {
        assertFalse (allTestJob1 == allTestJob2);
    }
}
