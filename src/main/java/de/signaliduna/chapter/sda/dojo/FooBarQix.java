package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

  public String compute(String givenNumber) {
    if ("1".equals(givenNumber) || "2".equals(givenNumber) || "4".equals(givenNumber)) {
      return givenNumber;
    }
    return "Foo";
  }
}
