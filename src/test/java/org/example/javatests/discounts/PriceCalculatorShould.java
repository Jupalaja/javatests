package org.example.javatests.discounts;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_arent_prices() {

        PriceCalculator calculator = new PriceCalculator();
        assertEquals(calculator.getTotal(),0,0);
    }

    @Test
    public void total_is_sum_of_prices() {

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10);
        calculator.addPrice(15);
        assertEquals(calculator.getTotal(),25,0);

    }

    @Test
    public void apply_discount_to_prices() {

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(18);
        calculator.addPrice(12);
        calculator.applyDiscount(10);
        assertEquals(calculator.getTotal(),27,0);
    }
}