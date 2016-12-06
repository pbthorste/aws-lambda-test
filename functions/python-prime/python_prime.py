from __future__ import print_function

import json

print('Loading function')


def handler(event, context):
    n=100000
    primes=0
    for p in range(2, n+1):
        for i in range(2, p):
            if p % i == 0:
                break
        else:
            primes += 1
    return "Number of primes under: " +  str(n) + " is: " + str(primes)
