package de.signaliduna.chapter.sda.dojo;

import org.apache.commons.lang3.StringUtils;

public class Occurence {

  public String compute(String givenNumber) {
      int count = StringUtils.countMatches(givenNumber, "3");
      if (givenNumber.contains("33")) {
	   return "FooFoo";
   }
   return "Foo";  
  }
}
