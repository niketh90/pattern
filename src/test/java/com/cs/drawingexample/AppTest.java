package com.cs.drawingexample;

import org.junit.Assert;

import junit.framework.Test;
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
     *//*
    public AppTest( String testName )
    {
        super( testName );
    }

    *//**
     * @return the suite of tests being tested
     *//*
    public static Test suite()
    {
        return new TestSuite( AppTest.class );	
    }

    *//**
     * Rigourous Test :-)
     *//*
    public void testApp()
    {
        //assertTrue( true );
    	assertEquals(App.getHelloWorld(), "Hello World1");
    }
    */
	

	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}
    
	

}
