package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class OccurrenceShould {

  @Test
  @Parameters({"3", "13", "23", "43", "132"})
  public void returnFooForContainDigitThree(final String givenNumber) {
    // when
    final String actual = new Occurence().compute(givenNumber);
    
    // then
    then(actual).isEqualTo("Foo");
  }

  @Test
  @Parameters({"5", "15", "25", "152"})
  public void returnBarForContainDigitFive(final String givenNumber) {
    // when
    final String actual = new Occurence().compute(givenNumber);

    // then
    then(actual).isEqualTo("Bar");
  }
  
  @Test
  @Parameters({"33", "133", "1233", "330", "303"})
  public void returnFooFooForContainDigitThreeTwice(final String givenNumber) {
    // when
    final String actual = new Occurence().compute(givenNumber);

    // then
    then(actual).isEqualTo("FooFoo");
  }

  @Test
  @Parameters({"55", "155", "1255", "550", "505"})
  public void returnBarBarForContainDigitFiveTwice(final String givenNumber) {
    // when
    final String actual = new Occurence().compute(givenNumber);

    // then
    then(actual).isEqualTo("BarBar");
  }

  @Test
  @Parameters({"353", "3 5 3", "3053"})
  public void returnFooBarFoo(final String givenNumber) {
    // when
    final String actual = new Occurence().compute(givenNumber);

    // then
    then(actual).isEqualTo("FooBarFoo");
  }
}
