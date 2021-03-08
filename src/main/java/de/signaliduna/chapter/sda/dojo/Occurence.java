package de.signaliduna.chapter.sda.dojo;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Occurence {

  public String compute(String givenNumber) {
      int count = StringUtils.countMatches(givenNumber, "3");
      if (givenNumber.contains("33")) {
	   return "FooFoo";

      }

      if (givenNumber.contains("303")) {
    	  return "FooFoo";  
      }
      char[] chars = givenNumber.toCharArray();
      List<String> result = new ArrayList<>();
      for (char aChar : chars) {
          if ('3' == aChar) {
           result.add("Foo");
          }
      }
    return StringUtils.join(result);
  }
}
