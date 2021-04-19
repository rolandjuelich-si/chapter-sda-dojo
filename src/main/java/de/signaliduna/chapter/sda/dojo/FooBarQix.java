package de.signaliduna.chapter.sda.dojo;

import java.util.List;

public class FooBarQix implements Computable {

  private final List<Computable> computables;

  public FooBarQix(final List<Computable> computables) {
    this.computables = computables;
  }

  @Override
  public String compute(final String givenNumber) {
    String ergebnis = "";

    for (final Computable computable : computables) {
      ergebnis += computable.compute(givenNumber);
    }

    if (ergebnis.isEmpty()) {
      ergebnis = givenNumber;
    }

    return ergebnis;
  }
}
