package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;
import org.junit.Test;

public class FooBarQixShould {

  @Test
  public void returnFooForNine() {
    //given
    final String givenNumber = "9";
    //when
    final String actual = new FooBarQix().compute(givenNumber);
    //then
    then(actual).isEqualTo("Foo");
  }
  

}