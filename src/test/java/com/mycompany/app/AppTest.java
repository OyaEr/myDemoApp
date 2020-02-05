package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

public void testEven() {
ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5,6,7,8));
ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,2,3,4));
assertFalse(new App().search(array,array2,3,1));
}

public void testDivideByZero() {
ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5,6,7,8));
ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(0,1,2,3));
assertFalse(new App().search(array,array2,3,0));
}

public void testOdd() {
ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5,6,7,8));
ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,2,3,4));
assertTrue(new App().search(array,array2,2,0));
}

public void testEmptyArray() {
ArrayList<Integer> array = new ArrayList<>();
ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,2,3,4));
assertFalse(new App().search(array,array2, 0,2));
}

public void testNull() {
ArrayList<Integer> array = null;
ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
assertFalse(new App().search(array,array2,1, 1));
}

public void testIndexOut() {
ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 0));
assertFalse(new App().search(array,array2,2, 5));
}

}
