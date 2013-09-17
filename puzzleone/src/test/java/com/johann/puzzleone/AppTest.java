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
      
    	for(int i = 0; i < 100000; i++){
    	Assert.assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", puzzle.convert(56945781));
    	}
    	
    	 
    } 
    
    public void testAdvanced_t()
    {
      
    	
    	Assert.assertEquals("ten thousand one hundred and eighty three", puzzle.convert(10183));
    	Assert.assertEquals("five thousand eight hundred and eighty eight", puzzle.convert(5888)); 
    	 
    }
        
    public void testBasic_2()
    {
    	Assert.assertEquals("twelve", puzzle.convert(12));
    	
    	Assert.assertEquals("one hundred and five", puzzle.convert(105));
    	Assert.assertEquals("twenty two", puzzle.convert(22));
    	Assert.assertEquals("twenty one", puzzle.convert(21));
    	
    }
    
    public void testBasic()
    {
    	Assert.assertEquals("one", puzzle.convert(1));
    	Assert.assertEquals("twenty", puzzle.convert(20));
    }
}
