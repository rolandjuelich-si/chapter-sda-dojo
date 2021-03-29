package de.signaliduna.chapter.sda.dojo;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class FooBarQixShould {

  @Test
  public void callDivisibility() {
    // given
    final Divisibility divisibility = mock(Divisibility.class);
    // when
    new FooBarQix(divisibility, null).compute("");

    // then
    then(divisibility).should().compute(anyString());
  }

  @Test
  public void callOccurrence() {
    // given
    final Occurrence occurrence = mock(Occurrence.class);
    // when
    new FooBarQix(null, occurrence).compute("");

    // then
    then(occurrence).should().compute(anyString());
  }

  @Test
  public void callDivisibilityAndOccurrence() {
    // given
    final Divisibility divisibility = mock(Divisibility.class);
    final Occurrence occurrence = mock(Occurrence.class);
    // when
    //divisibility.compute("");
    new FooBarQix(divisibility, occurrence).compute("");

    // then
    final var inOrder = inOrder(divisibility, occurrence);
    inOrder.verify(divisibility).compute(anyString());
    inOrder.verify(occurrence).compute(anyString());
  }
}
