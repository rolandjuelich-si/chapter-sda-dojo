package de.signaliduna.chapter.sda.dojo;

import java.util.ArrayList;
import java.util.List;

public class Divisibility {

  private static final String FOO = "Foo";
  private static final String BAR = "Bar";
  private static final String QIX = "Qix";

  public String compute(final String givenNumber) {
    final List<String> result = new ArrayList<>();
    final int number = Integer.parseInt(givenNumber);

    if (number % 3 == 0) {
      result.add(FOO);
    }

    if (number % 5 == 0) {
      result.add(BAR);
    }

    if (number % 7 == 0) {
      result.add(QIX);
    }

    return String.join("", result);
  }
}
