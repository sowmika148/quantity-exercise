package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class CentimeterTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }
}
