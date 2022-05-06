package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 * @Test
 * public void testInitialGasTank() {
 *    Car test_car = new Car("Toyota", "Prius", 10, 50);
 *    assertEquals(10, test_car.getGasTankLevel(), .001);
 * }
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job test_job1;
    Job test_job2;

    @Before
    public void jobObject() {
         test_job1 = new Job();
         test_job2 = new Job();

    }

    //Use assertEquals, assertTrue,or assertFalse to test that the ID values for
    // the two objects are NOT the same and differ by 1.

    @Test
    public void testSettingJobId() {
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



}
