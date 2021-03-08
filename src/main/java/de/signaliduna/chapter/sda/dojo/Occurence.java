package de.signaliduna.chapter.sda.dojo;

import java.util.ArrayList;
import java.util.List;

public class Occurence {

  public String compute(final String givenNumber) {
    final List<String> result = new ArrayList<>();
    for (final char aChar : givenNumber.toCharArray()) {
      if ('3' == aChar) {
        result.add("Foo");
      }
      if ('5' == aChar) {
        result.add("Bar");
      }
    }
    return String.join("", result);
  }
}
