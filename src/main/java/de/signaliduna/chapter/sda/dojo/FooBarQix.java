package de.signaliduna.chapter.sda.dojo;

public class FooBarQix implements Computable {

  private final Divisibility divisibility;
  private final Occurrence occurrence;

  public FooBarQix(final Divisibility divisibility, final Occurrence occurrence) {
    this.divisibility = divisibility;
    this.occurrence = occurrence;
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
