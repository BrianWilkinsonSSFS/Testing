package org.ssfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SlopeTest {

    @Test
    public void testSlope() {
        assertEquals("The line defined by the points (9, 7) and (-12, 12) has a slope of -0.23809523809523808",
                Slope.slope(9, 7, -12, 12));
        assertEquals("The line defined by the points (3, 4) and (3, 7) is a vertical line and the slope is undefined.",
                Slope.slope(3, 4, 3, 7));

    }
}