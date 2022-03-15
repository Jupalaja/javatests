package org.example.javatests.reto2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuzzerShould {

    @Test
    public void fizz_when_divisible_by_three() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(6).equals("Fizz"));
    }
    @Test
    public void nothing_when_not_divisible() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(2).equals("2"));
    }
    @Test
    public void buzz_when_divisible_by_five() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(5).equals("Buzz"));
    }
    @Test
    public void fizzbuzz_when_divisible_by_both() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(15).equals("FizzBuzz"));
    }
    @Test
    public void fizzbuzz_10() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(10).equals("Buzz"));
    }
    @Test
    public void fizzbuzz_30() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(30).equals("FizzBuzz"));
    }
    @Test
    public void fizzbuzz_16() {

        Buzzer buzzer = new Buzzer();
        assertTrue(buzzer.fizzBuzz(16).equals("16"));
    }
}