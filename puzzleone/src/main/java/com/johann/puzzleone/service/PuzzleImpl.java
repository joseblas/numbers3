package com.johann.puzzleone.service;

import java.text.DecimalFormat;

public class PuzzleImpl implements PuzzleOne  {

	//avoid public access
	private PuzzleImpl(){
		super();
	}
	
	static class PuzzleImplHolder {
	        static final PuzzleOne INSTANCE = new PuzzleImpl();
	}
	public static PuzzleOne getInstance() {
	        return PuzzleImplHolder.INSTANCE;
	}
	
	
	private final String[] tensNames = {
	    "",
	    " ten",
	    " twenty",
	    " thirty",
	    " forty",
	    " fifty",
	    " sixty",
	    " seventy",
	    " eighty",
	    " ninety"
	  };

	  private final String[] numNames = {
	    "",
	    " one",
	    " two",
	    " three",
	    " four",
	    " five",
	    " six",
	    " seven",
	    " eight",
	    " nine",
	    " ten",
	    " eleven",
	    " twelve",
	    " thirteen",
	    " fourteen",
	    " fifteen",
	    " sixteen",
	    " seventeen",
	    " eighteen",
	    " nineteen"
	  };

	  private  String convert(int number) {
	    
	    StringBuilder aux = new StringBuilder();

	    if (number % 100 < 20){
	      aux.append(numNames[number % 100]);
	      number /= 100;
	    }
	    else {

	      aux.append(tensNames[(number/10) % 10]).append(numNames[(number) % 10]);
	      number /= 100;
	    }
	    if (number == 0){
	    	return aux.toString();
	    }
	    
	    return numNames[number] + hundred + aux.toString();
	  }


	  /* (non-Javadoc)
	 * @see com.johann.puzzleone.service.PuzzleOne#convert(long)
	 */
	public String convert(long number) {
	    // 0 to 999 999 999
	    if (number == 0) { return "zero"; }

	    String snumber = Long.toString(number);
	    StringBuilder result = new StringBuilder(1*64);

	    
	    snumber = df.format(number);
	    
	    for(int i = 0; i < 9; i +=3){
	    	int illions = Integer.parseInt(snumber.substring(i,i+3));
	    	if(illions != 0){
	  
	    		result.append( convert(illions)  + getEnding(i));
	    	}
	    }
	    return result.toString().trim();
	   

	  }


	private  String getEnding(int i) {
		
		switch(i){
		
		case 0: return(million);
		case 3:  return(thousand);//end = " thousand";break;
		
		default: return("");
		}
		
	}

 private static final String million = " million";
 private static final String thousand = " thousand";
 private static final String hundred = " hundred and";

 //pad with "0"
 private static final String mask = "000000000";
 private static final DecimalFormat df = new DecimalFormat(mask);
}
