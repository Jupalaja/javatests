package org.example.javatests.reto2;

import org.junit.Assert;
import org.junit.Test;

public class ConvertShould {

    @Test
    public void test_normal_numbers() {

        /*  TESTING "NORMAL" NUMBERS
            arabicToRoman(1) ⇒ "I"
            arabicToRoman(2) ⇒ "II"
            arabicToRoman(3) ⇒ "III"
            arabicToRoman(5) ⇒ "V"
            arabicToRoman(6) ⇒ "VI"
            arabicToRoman(7) ⇒ "VII"
            arabicToRoman(10) ⇒ "X"
            arabicToRoman(11) ⇒ "XI"
            arabicToRoman(15) ⇒ "XV"
            arabicToRoman(16) ⇒ "XVI"
            arabicToRoman(50) ⇒ "L"
            arabicToRoman(51) ⇒ "LI"
            arabicToRoman(55) ⇒ "LV"
            arabicToRoman(56) ⇒ "LVI"
            arabicToRoman(60) ⇒ "LX"
            arabicToRoman(70) ⇒ "LXX"
            arabicToRoman(80) ⇒ "LXXX"
            arabicToRoman(81) ⇒ "LXXXI"
            arabicToRoman(85) ⇒ "LXXXV"
            arabicToRoman(86) ⇒ "LXXXVI"
            arabicToRoman(126) ⇒ "CXXVI"
            arabicToRoman(2507) ⇒ "MMDVII"   */

        Convert convert = new Convert();

        Assert.assertEquals("I", convert.toRoman(1));
        Assert.assertEquals("II",convert.toRoman(2));
        Assert.assertEquals("III",convert.toRoman(3));
        Assert.assertEquals("V",convert.toRoman(5));
        Assert.assertEquals("VI",convert.toRoman(6));
        Assert.assertEquals("VII",convert.toRoman(7));
        Assert.assertEquals("X",convert.toRoman(10));
        Assert.assertEquals("XI",convert.toRoman(11));
        Assert.assertEquals("XV",convert.toRoman(15));
        Assert.assertEquals("XVI",convert.toRoman(16));
        Assert.assertEquals("L",convert.toRoman(50));
        Assert.assertEquals("LI",convert.toRoman(51));
        Assert.assertEquals("LV",convert.toRoman(55));
        Assert.assertEquals("LVI",convert.toRoman(56));
        Assert.assertEquals("LX",convert.toRoman(60));
        Assert.assertEquals("LXX",convert.toRoman(70));
        Assert.assertEquals("LXXX",convert.toRoman(80));
        Assert.assertEquals("LXXXI",convert.toRoman(81));
        Assert.assertEquals("LXXXVI",convert.toRoman(86));
        Assert.assertEquals("CXXVI",convert.toRoman(126));
        Assert.assertEquals("X",convert.toRoman(10));

    }

    @Test
    public void test_weird_numbers() {

     /* TESTING "NORMAL" NUMBERS
        arabicToRoman(4) ⇒ "IV"
        arabicToRoman(9) ⇒ "IX"
        arabicToRoman(14) ⇒ "XIV"
        arabicToRoman(19) ⇒ "XIX"
        arabicToRoman(24) ⇒ "XXIV"
        arabicToRoman(40) ⇒ "XL"
        arabicToRoman(49) ⇒ "XLIX"
        arabicToRoman(90) ⇒ "XC"
        arabicToRoman(99) ⇒ "XCIX"
        arabicToRoman(400) ⇒ "CD"
        arabicToRoman(900) ⇒ "CM" */

        Convert convert = new Convert();

        Assert.assertEquals("IV",convert.toRoman(4));
        Assert.assertEquals("IX",convert.toRoman(9));
        Assert.assertEquals("XIV",convert.toRoman(14));
        Assert.assertEquals("XIX",convert.toRoman(19));
        Assert.assertEquals("XXIV",convert.toRoman(24));
        Assert.assertEquals("XL",convert.toRoman(40));
        Assert.assertEquals("XLIX",convert.toRoman(49));
        Assert.assertEquals("XC",convert.toRoman(90));
        Assert.assertEquals("XCIX",convert.toRoman(99));
        Assert.assertEquals("CD",convert.toRoman(400));
        Assert.assertEquals("CM",convert.toRoman(900));

    }
}