package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MyAwesomeTest {

/*    Rules
    If the number is divisible by 3, write “Foo” instead of the number
    If the number is divisible by 5, add “Bar”
    If the number is divisible by 7, add “Qix”
    For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
    Examples
    1  => 1
    2  => 2
    3  => FooFoo (divisible by 3, contains 3)
    4  => 4
    5  => BarBar (divisible by 5, contains 5)
    6  => Foo (divisible by 3)
    7  => QixQix (divisible by 7, contains 7)
    8  => 8
    9  => Foo
    10 => Bar
    13 => Foo
    15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
    21 => FooQix
    33 => FooFooFoo (divisible by 3, contains two 3)
    51 => FooBar
    53 => BarFoo
*/

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
      "13,Foo", //
      "15,FooBarBar", //
      "21,FooQix", //
      "33,FooFooFoo", //
      "51,FooBar", //
      "53,BarFoo"})
  public void shouldFail(final String givenNumber, final String expected) {
    // given

    // when
    final String actual = compute(givenNumber);

    // then
    then(actual).isEqualTo(expected);
  }

  private String compute(final String givenNumber) {
    return null;
  }
}