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

    @Test
    void should_NotEquate_0Point1_Km_And_100_cm() {
        Length zeroPointOneKm = new Length(0.1, Unit.KM);
        Length hundredCentimeter = new Length(100, Unit.CM);

        assertThat(zeroPointOneKm, is(not(equalTo(hundredCentimeter))));
    }

    @Test
    void should_Equate_1_Km_And_100000_cm() {
        Length oneKm = new Length(1, Unit.KM);
        Length oneLakhCm = new Length(100000, Unit.CM);

        assertThat(oneKm, is(equalTo(oneLakhCm)));
    }

    @Test
    void should_Return_2_m_When_100_cm_and_1_m_IsAdded() {
        Length oneMeter = new Length(1, Unit.M);
        Length hundredCentimeter = new Length(100, Unit.CM);
        Length result = oneMeter.add(hundredCentimeter);

        assertThat(2.0, is(equalTo(result.getMagnitude())));
        assertThat(Unit.M, is(equalTo(result.getUnit())));
    }

    @Test
    void should_Return_100200_cm_When_200_cm_and_1_km_IsAdded() {
        Length twoHundredCentimeter = new Length(200, Unit.CM);
        Length oneKilometer = new Length(1, Unit.KM);
        Length result = twoHundredCentimeter.add(oneKilometer);

        assertThat(100200.0, is(equalTo(result.getMagnitude())));
        assertThat(Unit.CM, is(equalTo(result.getUnit())));
    }
}
