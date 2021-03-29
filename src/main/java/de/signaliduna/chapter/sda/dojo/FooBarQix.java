package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

  private final Divisibility divisibility;
  private final Occurrence occurrence;

  public FooBarQix(final Divisibility divisibility, final Occurrence occurrence) {
    this.divisibility = divisibility;
    this.occurrence = occurrence;
  }

  public String compute(final String givenNumber) {
    if (occurrence != null) {
      return occurrence.compute(givenNumber);
    }
    if (divisibility != null) {
      return divisibility.compute(givenNumber);
    }
    return null;
  }
}
