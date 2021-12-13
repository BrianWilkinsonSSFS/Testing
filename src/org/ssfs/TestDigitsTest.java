package org.ssfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDigitsTest {

    @Test
    public void testDigits() {
        assertEquals(true, ShareDigit.numbers(14, 43));
        assertEquals(true, ShareDigit.numbers(99, 39));
        assertEquals(false, ShareDigit.numbers(22, 65));
        assertEquals(false, ShareDigit.numbers(11, 88));
    }
}
