package de.signaliduna.chapter.sda.dojo;

import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class FooBarQixShould {

  @Test
  public void callDivisibility() throws Exception {
    // given
    Divisibility divisibility = Mockito.mock(Divisibility.class);
    // when
    new FooBarQix(divisibility, null).compute("");

    // then
    BDDMockito.then(divisibility).should().compute(Mockito.anyString());
  }

  @Test
  public void callOccurrence() throws Exception {
    // given
    Occurrence occurrence = Mockito.mock(Occurrence.class);
    // when
    new FooBarQix(null, occurrence).compute("");
    
    // then
    BDDMockito.then(occurrence).should().compute(Mockito.anyString());
  }

  @Test
  public void callDivisibilityAndOccurrence() throws Exception {
    // given
    Divisibility divisibility = Mockito.mock(Divisibility.class);
    Occurrence occurrence = Mockito.mock(Occurrence.class);
    // when
    new FooBarQix(null, occurrence).compute("");

    // then
    BDDMockito.then(occurrence).should().compute(Mockito.anyString());
    BDDMockito.then(divisibility).should().compute(Mockito.anyString());
  }

}
