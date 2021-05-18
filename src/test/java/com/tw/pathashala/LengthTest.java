package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

class LengthTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Length oneLength = new Length(1, Unit.CM);
        Length anotherOneLength = new Length(1, Unit.CM);

        assertThat(oneLength, is(equalTo(anotherOneLength)));
    }

    @Test
    void should_NotEquate_1_cm_And_2_cm() {
        Length oneLength = new Length(1, Unit.CM);
        Length anotherTwoLength = new Length(2, Unit.CM);

        assertThat(oneLength, is(not(equalTo(anotherTwoLength))));
    }

    @Test
    void should_Equate_1_m_And_100_cm() {
        Length oneMeter = new Length(1, Unit.M);
        Length hundredCentimeter = new Length(100, Unit.CM);

        assertThat(oneMeter, is(equalTo(hundredCentimeter)));
    }
}
