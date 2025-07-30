package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit testing for basic App functionality.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case instance
     *
     * @param testCaseName name of the test case
     */
    public AppTest( String testCaseName )
    {
        super( testCaseName );
    }

    /**
     * @return the complete suite of tests being executed
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Thorough Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
