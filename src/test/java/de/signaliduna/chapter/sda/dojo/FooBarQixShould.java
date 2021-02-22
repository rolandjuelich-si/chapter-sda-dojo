package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FooBarQixShould {

  @Test
  public void returnNumberForOne() {
    //given
    final String givenNumber = "1";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("1");
  }

  @Test
  public void returnNumberForTwo() {
    //given
    final String givenNumber = "2";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("2");
  }

  @Test
  public void returnNumberForFour() {
    //given
    final String givenNumber = "4";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("4");
  }

  @Test
  public void returnFooForSix() {
    //given
    final String givenNumber = "6";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Foo");
  }

  @Test
  public void returnFooForNine() {
    //given
    final String givenNumber = "9";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Foo");
  }

  @Test
  public void returnFooForTwelve() {
    //given
    final String givenNumber = "12";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Foo");
  }

  @Test
  @Parameters({"5", "10", "20"})
  public void returnBarForDivisibleByFive(final String givenNumber) {
    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Bar");
  }

  @Test
  @Parameters({"14", "28", "49"})
  public void returnQixForDivisibleBySeven(final String givenNumber) {
    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Qix");
  }
}