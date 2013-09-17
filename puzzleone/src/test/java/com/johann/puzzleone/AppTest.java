package com.johann.puzzleone;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.johann.puzzleone.service.Puzzle;
import com.johann.puzzleone.service.PuzzleImpl;

public class AppTest extends TestCase
{
    private PuzzleImpl puzzle;
	
	public AppTest( String testName )
    {
        super( testName );
        puzzle = new PuzzleImpl();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    public void testAdvanced()
    {
    	System.out.println(PuzzleImpl.convert(56945781));
    	System.out.println("fifty six million nine hundred and forty five thousand seven hundred and eighty one");
    	Assert.assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", PuzzleImpl.convert(56945781));
    }
        
    public void testBasic_2()
    {
    	Assert.assertEquals("twenty one", PuzzleImpl.convert(21));
    	
    	Assert.assertEquals("one hundred and five", PuzzleImpl.convert(105));
    	Assert.assertEquals("twenty one", PuzzleImpl.convert(21));
    	Assert.assertEquals("twenty one", PuzzleImpl.convert(21));
    	
    }
    
    public void testBasic()
    {
    	Assert.assertEquals("one", PuzzleImpl.convert(1));
    	Assert.assertEquals("twenty", PuzzleImpl.convert(20));
    }
}
