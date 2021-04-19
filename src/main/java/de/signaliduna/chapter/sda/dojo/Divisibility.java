package de.signaliduna.chapter.sda.dojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Divisibility implements Computable{

  private static final String FOO = "Foo";
  private static final String BAR = "Bar";
  private static final String QIX = "Qix";

  private Map<Integer, String> values;

  public Divisibility(Map<Integer, String> values) {
    this.values = values;
  }

  public Divisibility() {
    this.values = new HashMap<>();
  }

  @Override
  public String compute(final String givenNumber) {
    fooBarQix();
    final List<String> result = new ArrayList<>();
    final int number = Integer.parseInt(givenNumber);

    for (Integer divisor : this.values.keySet()) {
      if (number % divisor == 0) {
        result.add(values.get(divisor));
      }
    }
    
    return String.join("", result);
  }

  public static Divisibility fooBarQix() {
    Map<Integer, String> values = new HashMap<>();
    values.put(3, FOO);
    values.put(5, BAR);
    values.put(7, QIX);
    return new Divisibility(values);
  }
}
