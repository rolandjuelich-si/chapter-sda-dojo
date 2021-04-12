package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class DivisibilityShould {

  @Test
  @Parameters({"1", "2", "4"})
  public void returnNumberForDefault(final String givenNumber) {
    // when
    final String actual = new Divisibility().compute(givenNumber);

    // then
    then(actual).isEmpty();
  }

  @Test
  @Parameters({"6", "9", "12"})
  public void returnFooForDivisibleByThree(final String givenNumber) {
    // when
    final String actual = new Divisibility().compute(givenNumber);

    // then
    then(actual).isEqualTo("Foo");
  }

  @Test
  @Parameters({"5", "10", "20"})
  public void returnBarForDivisibleByFive(final String givenNumber) {
    // when
    final String actual = new Divisibility().compute(givenNumber);

    // then
    then(actual).isEqualTo("Bar");
  }

  @Test
  @Parameters({"14", "28", "49"})
  public void returnQixForDivisibleBySeven(final String givenNumber) {
    // when
    final String actual = new Divisibility().compute(givenNumber);

    // then
    then(actual).isEqualTo("Qix");
  }
  
  // TODO Testfall 21: Wenn mehrere Teilungsregeln zuteffen muss FooQix raus kommen

  // Ich verstehe kein Wort XD
  @Test
  @Parameters({"15, FooBar"})
  public void returnFooBar(final String givenNumber, final String expected) {
    // when
    final String actual = new Divisibility().compute(givenNumber);

    // then
    then(actual).isEqualTo(expected);
  }
}