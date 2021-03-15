package de.signaliduna.chapter.sda.dojo;

public class Divisibility {

  public String compute(final String givenNumber) {
    final int number = Integer.parseInt(givenNumber);
    if (number % 3 == 0) {
      return "Foo";
    }

    if (number % 5 == 0) {
      return "Bar";
    }

    if (number % 7 == 0) {
      return "Qix";
    }

    return givenNumber;
  }
}