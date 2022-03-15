package org.example.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void testRepeat_multiple_times() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }
    @Test
    public void testRepeat_one_time() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola",1));
    }
    @Test
    public void testRepeat_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola",0));

    }
    @Test(expected=IllegalArgumentException.class)
    public void testRepeat_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola",-2));
    }
     @Test
    public void isEmpty_actually_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void isEmpty_null_string() {
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void isEmpty_not() {
        assertTrue(!StringUtil.isEmpty("ABC"));
    }
    @Test
    public void isEmpty_spaces() {
        assertTrue(StringUtil.isEmpty("   "));
    }

}
