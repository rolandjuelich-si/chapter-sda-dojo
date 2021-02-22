package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

  public String compute(String givenNumber) {
    Integer number = Integer.valueOf(givenNumber);
	  if ( number % 3 == 0) 
    {
        return "Foo";
      }
    return givenNumber;
  }
}
