package de.signaliduna.chapter.sda.dojo;

import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

public class Occurence {

  public String compute(String givenNumber) {
      int count = StringUtils.countMatches(givenNumber, "3");
      if (givenNumber.contains("33")) {
	   return "FooFoo";

      }
 
      
      if (givenNumber.contains("303")) {
    	  return "FooFoo";  
      }
      IntStream chars = givenNumber.chars();
 
	
   
   
		
	 
      
      return "Foo"; 
  }
}
