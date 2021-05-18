package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

class QuantityTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Quantity oneQuantity = new Quantity(1, Unit.CM);
        Quantity anotherOneQuantity = new Quantity(1, Unit.CM);

        assertThat(oneQuantity, is(equalTo(anotherOneQuantity)));
    }

    @Test
    void should_NotEquate_1_cm_And_2_cm() {
        Quantity oneQuantity = new Quantity(1, Unit.CM);
        Quantity anotherOneQuantity = new Quantity(2, Unit.CM);

        assertThat(oneQuantity, is(not(equalTo(anotherOneQuantity))));
    }
}
