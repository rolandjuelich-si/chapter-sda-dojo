package de.signaliduna.chapter.sda.dojo;

import org.assertj.core.api.BDDAssertions;
import org.junit.Test;

public class MyAwesomeTest {
    
    @Test
    public void shouldFail() {
        BDDAssertions.fail("Hallo neuer 2.Fehler");
    }
}