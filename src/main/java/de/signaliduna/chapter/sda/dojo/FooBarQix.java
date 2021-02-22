package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

  public String compute(String givenNumber) {
    if ("6".equals(givenNumber) || "9".equals(givenNumber) || "12".equals(givenNumber)) {
        return "Foo";
      }
    return givenNumber;
  }
}
