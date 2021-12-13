package org.ssfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscriminantAndRootsTest {

    @Test
    public void roots() {
        assertEquals("1x^2 + 4x + 4 has 1 real root", DiscriminantAndRoots.roots(1, 4, 4));
        assertEquals("1x^2 + 2x + 3 has 2 imaginary roots", DiscriminantAndRoots.roots(1, 2, 3));
        assertEquals("1x^2 + 5x + 6 has 2 real roots", DiscriminantAndRoots.roots(1, 5, 6));

    }
}