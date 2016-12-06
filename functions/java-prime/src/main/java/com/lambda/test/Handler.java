package com.lambda.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

/**
 * Created by pbt on 2016-12-04.
 */
public class Handler implements RequestHandler<Map<String, Object>, String> {

    @Override
    public String handleRequest(Map<String, Object> input, Context context) {
        return calculatePrime();
    }

    public String calculatePrime() {
        int n = 100000;
        int primes = 0;
        for(int p = 2; p < n + 1; p++) {
            boolean isPrime = true;
            for(int i = 2; i < p; i++) {
                if ( p%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes++;
            }
        }
        String result = "Number of primes under: " + n + ", are: "+ primes;
        System.out.println(result);
        return result;
    }
}
