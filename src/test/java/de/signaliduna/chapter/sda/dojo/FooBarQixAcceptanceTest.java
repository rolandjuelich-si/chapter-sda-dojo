package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FooBarQixAcceptanceTest {

/*
Rules:
    If the number is divisible by 3, write “Foo” instead of the number
    If the number is divisible by 5, add “Bar”
    If the number is divisible by 7, add “Qix”
    For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
*/

  private final Computable application = new FooBarQix(Arrays.asList(new Divisibility(), new Occurrence()));

  @Test
  @Parameters({
      "1,1", //
      "2,2", //
      "3,FooFoo", //
      "4,4", //
      "5,BarBar", //
      "6,Foo", //
      "7,QixQix", //
      "8,8", //
      "9,Foo", //
      "10,Bar", //
      "12,Foo", //
      "13,Foo", //
      "15,FooBarBar", //
      "21,FooQix", //
      "33,FooFooFoo", //
      "51,FooBar", //
      "53,BarFoo" ,//
      "353,FooBarFoo"})
  public void shouldCompute(final String givenNumber, final String expected) {
    //when 
    final String actual = application.compute(givenNumber);

    // then
    then(actual).isEqualTo(expected);
  }

}