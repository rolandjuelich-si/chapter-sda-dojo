package de.signaliduna.chapter.sda.dojo;

import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class FooBarQixShould {

  @Test
  public void testName() throws Exception {
    // given
    Divisibility divisibility = Mockito.mock(Divisibility.class);
    // when
    new FooBarQix(divisibility).compute("");

    // then
    BDDMockito.then(divisibility).should().compute(Mockito.anyString());
  }

  @Test
  public void testName1() throws Exception {
    // given
    Divisibility divisibility = Mockito.mock(Divisibility.class);
    // when
    new FooBarQix(divisibility).compute("");

    // then
    BDDMockito.then(divisibility).should().compute(Mockito.anyString());
  }

}
