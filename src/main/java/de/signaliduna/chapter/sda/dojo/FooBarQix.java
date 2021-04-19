package de.signaliduna.chapter.sda.dojo;

import java.util.Arrays;
import java.util.List;

public class FooBarQix implements Computable {

  private final Divisibility divisibility;
  private final Occurrence occurrence;
    private final List<Computable> computables;

    public FooBarQix(final Divisibility divisibility, final Occurrence occurrence) {
    this.divisibility = divisibility;
    this.occurrence = occurrence;
    this.computables = Arrays.asList(new Divisibility(), new Occurrence());
  }

  @Override
public String compute(final String givenNumber) {
    String ergebnis = "";
    ergebnis += divisibility.compute(givenNumber);
    ergebnis += occurrence.compute(givenNumber);

    if (ergebnis.isEmpty()) {
      ergebnis = givenNumber;
    }

    return ergebnis;
  }
}
