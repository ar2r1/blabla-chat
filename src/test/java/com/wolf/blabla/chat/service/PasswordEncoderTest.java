package com.wolf.blabla.chat.service;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class PasswordEncoderTest {

    private final PasswordEncoder passwordEncoder = new PasswordEncoder();

    @Test
    public void encodeShouldEncodeInputString() {
        final String actual = passwordEncoder.encode("password");
        final String expected = "password";

        assertThat(actual, is(expected));
//        assertEquals("is ",expected, null);
    }

}