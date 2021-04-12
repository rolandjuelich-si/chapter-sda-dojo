package de.signaliduna.chapter.sda.dojo;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FooBarQixShould {

  @Test
  public void callDivisibilityAndOccurrence() {
    // given
    final Divisibility divisibility = mock(Divisibility.class);
    final Occurrence occurrence = mock(Occurrence.class);

    // when
    new FooBarQix(divisibility, occurrence).compute("");

    // then
    final var inOrder = inOrder(divisibility, occurrence);
    inOrder.verify(divisibility).compute(anyString());
    inOrder.verify(occurrence).compute(anyString());
  }

  @Test
  @Parameters({
      "1,1",
      "2,2",
      "4,4"
  })
  public void returnGivenNumberIfNoRuleApplies(final String given, final String expected) {
    // given
    final Divisibility divisibility = new Divisibility();
    final Occurrence occurrence = new Occurrence();

    // when
    final String actual = new FooBarQix(divisibility, occurrence).compute(given);

    // then
    then(actual).isEqualTo(expected);
  }
}
