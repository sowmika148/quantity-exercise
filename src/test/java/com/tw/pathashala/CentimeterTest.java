package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

class CentimeterTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_NotEquate_1_cm_And_2_cm() {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherOneCentimeter = new Centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(anotherOneCentimeter))));
    }

}
