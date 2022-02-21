package edu.kau.fcit.cpit252;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void assertClonesNotEqual(){
        Car c1 = new Car("Honda", "Accord", 2019);
        // Make a clone
        Car c2 = c1.clone();
        assertNotEquals(c1, c2);
    }
}
