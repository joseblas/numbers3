package com.johann.puzzleone;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.johann.puzzleone.service.PuzzleImpl;
import com.johann.puzzleone.service.PuzzleOne;

public class AppTest extends TestCase
{
    private PuzzleOne puzzle;
	
	public AppTest( String testName )
    {
        super( testName );
        puzzle = PuzzleImpl.getInstance();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    

    
    public void testAdvanced_m()
    {
      
    	
    	Assert.assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", puzzle.convert(56945781));
    	
    	Assert.assertEquals("ninety six million two hundred and sixty two thousand seven hundred and eighty one", 
    			puzzle.convert(96262781));
    	
    	 
    } 
    
    public void testAdvanced_t()
    {
      
    	
    	Assert.assertEquals("ten thousand one hundred and eighty three", puzzle.convert(10183));
    	Assert.assertEquals("five thousand eight hundred and eighty eight", puzzle.convert(5888));
    	
    	Assert.assertEquals("ten thousand", puzzle.convert(10000));
    	Assert.assertEquals("five thousand", puzzle.convert(5000));
    	
    	
    	Assert.assertEquals("one thousand two hundred and thirty nine", puzzle.convert(1239));
    	Assert.assertEquals("one thousand two hundred and thirty", puzzle.convert(1230));
    	Assert.assertEquals("one thousand two hundred", puzzle.convert(1200));
    	Assert.assertEquals("one thousand one hundred", puzzle.convert(1100));
    	Assert.assertEquals("two thousand", puzzle.convert(2000));
    	Assert.assertEquals("one thousand", puzzle.convert(1000));
    	 
    }
        
    public void testBasic_not(){
    	Assert.assertNotSame("One hundred", puzzle.convert(100));
    	Assert.assertNotSame("one Hundred", puzzle.convert(100));
    	Assert.assertNotSame("two hundreds", puzzle.convert(200));
    	Assert.assertNotSame("twenty ", puzzle.convert(20));
    	Assert.assertNotSame(" twenty", puzzle.convert(20));
    	Assert.assertNotSame("Twenty ", puzzle.convert(20));
    }
    
    public void testBasic_h()
    {
    	
    	Assert.assertEquals("one hundred and twenty five", puzzle.convert(125));
    	Assert.assertEquals("one hundred and five", puzzle.convert(105));
    	Assert.assertEquals("six hundred", puzzle.convert(600));
    	Assert.assertEquals("one hundred", puzzle.convert(100));
    	
    	
    }
    
    public void testBasic()
    {
    	Assert.assertEquals("ninety nine", puzzle.convert(99));
    	Assert.assertEquals("twenty two", puzzle.convert(22));
    	Assert.assertEquals("twenty one", puzzle.convert(21));
    	Assert.assertEquals("twelve", puzzle.convert(12));
    	Assert.assertEquals("ten", puzzle.convert(10));
    	Assert.assertEquals("one", puzzle.convert(1));
    	Assert.assertEquals("twenty", puzzle.convert(20));
    	
    }
}
