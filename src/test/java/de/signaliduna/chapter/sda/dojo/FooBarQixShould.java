package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.Test;

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
  public void returnBarForFive() {
    //given
    final String givenNumber = "5";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Bar");
  }

  @Test
  public void returnBarForTen() {
    //given
    final String givenNumber = "10";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Bar");
  }

  @Test
  public void returnBarForTwenty() {
    //given
    final String givenNumber = "20";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Bar");
  }

  @Test
  public void returnQixForFourteen() {
    //given
    final String givenNumber = "14";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Qix");
  }
  
  @Test
  public void returnQixForTwentyeight() {
    //given
    final String givenNumber = "28";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Qix");
  }
  
  @Test
  public void returnQixForFourtynine() {
    //given
    final String givenNumber = "49";

    //when
    final String actual = new FooBarQix().compute(givenNumber);

    //then
    then(actual).isEqualTo("Qix");
  }
  
}