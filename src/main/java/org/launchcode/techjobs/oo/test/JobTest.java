package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 *
 *
 *
 *
 *
 */
@RunWith(JUnit4.class)
public class JobTest {



    //Use assertEquals, assertTrue,or assertFalse to test that the ID values for
    // the two objects are NOT the same and differ by 1.

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertTrue((test_job1.getId()+1) == test_job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job newJob= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(newJob instanceof Job);

        assertTrue(newJob.getEmployer() instanceof Employer);

        assertEquals(newJob.getEmployer().getValue(),"ACME");

        assertEquals(newJob.getName(), "Product tester");

        assertTrue(newJob.getLocation() instanceof Location);

        assertEquals(newJob.getLocation().getValue(),"Desert");

        assertTrue(newJob.getPositionType() instanceof PositionType);

        assertEquals(newJob.getPositionType().getValue(),"Quality control");

        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(newJob.getCoreCompetency().getValue(),"Persistence");

    }
    @Test
    public void testJobsForEquality() {
        Job newJob1= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job newJob2= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(newJob1.equals(newJob2));

    }

    @Test
    public void  testToStringStartsAndEndsWithNewLine() {
        Job newJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //String testToString = newJob3.toString();

        assertEquals('\n', newJob3.toString().charAt(0));
        assertEquals('\n', newJob3.toString().charAt(newJob3.toString().length() -1));
        /*char firstChar = testToString.charAt(0);
        char lastChar = testToString.charAt(testToString.length()-1);
        assertTrue((firstChar == '\n') && (firstChar==lastChar));*/
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job newJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String correctAnswer = "\nID: " + newJob4.getId() + "\n" +
                "Name: " + newJob4.getName() + "\n" +
                "Employer: " + newJob4.getEmployer() + "\n" +
                "Location: " + newJob4.getLocation() + "\n" +
                "Position Type: " + newJob4.getPositionType() + "\n" +
                "Core Competency: " + newJob4.getCoreCompetency() + "\n";

        assertEquals(newJob4.toString(),correctAnswer);

    }

    @Test
    public void testToStringHandlesEmptyField() {

        /*Job noFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals("\nID: " + noFields.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n", noFields.toString());*/

        Job newJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String handlesEmptyField = "\nID: " + newJob5.getId() + "\n" +
                "Name: " + newJob5.getName() + "\n" +
                "Employer: " + newJob5.getEmployer() + "\n" +
                "Location: " + newJob5.getLocation() + "\n" +
                "Position Type: " + newJob5.getPositionType() + "\n" +
                "Core Competency: " + newJob5.getCoreCompetency() + "\n";

        assertEquals(newJob5.toString(),handlesEmptyField);


    }



}
