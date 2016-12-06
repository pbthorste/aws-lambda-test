package com.lambda.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pbt on 2016-12-04.
 */
public class HandlerTest {
    @Test
    public void testPrimes() {
        Handler handler = new Handler();

        handler.calculatePrime();
    }
}