# This file contains generally useful functions used in different problems.

def isPrime(n):
    """ Computes whether the given number n is prime or not
    """
    if (n < 2):
        return False
    else:
        i = 2
        prime = True
        while i*i <= n and prime:
            if n % i == 0:
                prime = False
            else:
                i += 1
        
        return prime