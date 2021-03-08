package de.signaliduna.chapter.sda.dojo;

import java.util.ArrayList;
import java.util.List;

public class Occurrence {

  private static final String FOO = "Foo";
  private static final String BAR = "Bar";
  private static final String QIX = "Qix";

  public String compute(final String givenNumber) {
    final List<String> result = new ArrayList<>();
    for (final char digit : givenNumber.toCharArray()) {
      if ('3' == digit) {
        result.add(FOO);
      }
      if ('5' == digit) {
        result.add(BAR);
      }
      if ('7' == digit) {
        result.add(QIX);
      }
    }
    return String.join("", result);
  }
}
