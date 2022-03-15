package org.example.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

        /*
        Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
        Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
        Todos los años divisibles por 4 son bisiestos (1996, 2004, 2012)
        Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
         */

    @Test
    public void leap_when_divisible_by_400() {
        assertTrue(DateUtil.isLeapYear(1600));
        assertTrue(DateUtil.isLeapYear(2000));
        assertTrue(DateUtil.isLeapYear(2400));
    }
    @Test
    public void not_leap_when_divisible_by_100_but_not_400() {
        assertFalse(DateUtil.isLeapYear(1700));
        assertFalse(DateUtil.isLeapYear(1800));
        assertFalse(DateUtil.isLeapYear(1900));
    }
    @Test
    public void leap_when_divisible_by_4() {
        assertTrue(DateUtil.isLeapYear(1996));
        assertTrue(DateUtil.isLeapYear(2004));
        assertTrue(DateUtil.isLeapYear(2012));
    }
    @Test
    public void not_leap_when_not_divisible_by_4() {
        assertFalse(DateUtil.isLeapYear(2017));
        assertFalse(DateUtil.isLeapYear(2018));
        assertFalse(DateUtil.isLeapYear(2019));
    }
}