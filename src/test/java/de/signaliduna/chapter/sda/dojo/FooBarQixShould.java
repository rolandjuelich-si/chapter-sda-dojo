package de.signaliduna.chapter.sda.dojo;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import org.junit.Test;

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
  
  // TODO Testfall 4: Wenn 4 rein kommt, soll auch 4 raus kommen
  
}
