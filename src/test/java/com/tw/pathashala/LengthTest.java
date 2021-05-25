package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static com.tw.pathashala.Length.*;
import static com.tw.pathashala.Length.kilometers;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LengthTest {
    @Test
    void should_equate_1_cm_to_1_cm() {
        assertThat(centimeters(1), is(equalTo(centimeters(1))));
    }

    @Test
    void should_notEquate_1_cm_And_2_cm() {
        assertThat(centimeters(1), is(not(equalTo(centimeters(2)))));
    }

    @Test
    void should_equate_1_m_And_100_cm() {
        assertThat(meters(1), is(equalTo(centimeters(100))));
    }

    @Test
    void should_notEquate_0Point1_Km_And_100_cm() {
        assertThat(kilometers(0.1), is(not(equalTo(centimeters(100)))));
    }

    @Test
    void should_equate_1_Km_And_100000_cm() {
        assertThat(kilometers(1), is(equalTo(centimeters(100000))));
    }

    @Test
    void should_be_2_m_when_100_cm_and_1_m_IsAdded() {
        assertThat(meters(2), is(equalTo(meters(1).add(centimeters(100)))));
    }

    @Test
    void should_be_100200_cm_when_200_cm_and_1_km_IsAdded() {
        assertThat(new Length(100200.0, Unit.CM), is(equalTo(centimeters(200).add(kilometers(1)))));
    }
}
