package com.epam.tc.hw1.tests;

import com.epam.tc.hw1.AbstractTest;
import org.testng.annotations.Test;

public class SubTest extends AbstractTest {

    @Test
    public void minTest() {

        double actual = calculator.sub(1.0, 2.0);
        double expected = -1.0;
        softAssert.assertEquals(actual, expected, 0.0001);
        softAssert.assertAll();
    }
}
