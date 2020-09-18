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
        //System.out.println(test_fullJob.getEmployer());
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

    //tests that two jobs that don't share the same ID are not equal.
    @Test
    public void testJobsForEquality() {
        assertFalse (allTestJob1 == allTestJob2);
        //System.out.println(allTestJob1);
    }

    //tests that the string begins and ends with empty lines
    @Test
    public void testOutputToString() {
    assertEquals(allTestJob1.toString().startsWith("\n"), true);
    assertEquals(allTestJob1.toString().endsWith("\n"), true);
    }


    //creates job with one missing field to test
    Job missingFieldJob;
    @Before
    public void createMissingField() {
        missingFieldJob = new Job("Ice Cream Maker", new Employer(""), new Location("Saint Louis"), new PositionType("Scooper"),new CoreCompetency("Stacker"));
    }

    //tests that all fields are full and matches correct output.
    @Test
    public void testForCorrectStringReturn() {
        assertEquals("\nID: 2\nName: Ice Cream Maker\nEmployer: Oberweis\nLocation: Saint Louis\nPosition Type: Scooper\nCore Competency: Stacker\n", allTestJob1.toString());
    }

    //tests that the missing field is replaced with data not available.
    @Test
    public void testJobForMissingOutput() {
        //System.out.println(missingFieldJob);
        assertEquals("Data not available", missingFieldJob.getEmployer().toString());
    }

    Job missingAllOptions;
    @Before
    public void createEmptyObject() {
        missingAllOptions = new Job ("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    //if all fields are empty return that string
    @Test
    public void testsForEmptyJob() {
        assertEquals("OOPS! This job does not seem to exist.", missingAllOptions.toString());
    }
}


//TODO: test for each of the 4 tests for toString.
