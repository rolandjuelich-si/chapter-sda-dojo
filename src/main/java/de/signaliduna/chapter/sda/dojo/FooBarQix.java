package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

  private final Divisibility divisibility;
  private final Occurrence occurrence;

  public FooBarQix(final Divisibility divisibility, final Occurrence occurrence) {
    this.divisibility = divisibility;
    this.occurrence = occurrence;
  }

  public String compute(final String givenNumber) {
    String ergebnis = "";
    if (divisibility != null) {
      ergebnis += divisibility.compute(givenNumber);
    }
    if (occurrence != null) {
      ergebnis += occurrence.compute(givenNumber);
    }
    return ergebnis;
  }
}
