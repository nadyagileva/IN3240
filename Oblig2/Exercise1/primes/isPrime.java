package primes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class isPrime {


	@Test
	public void isNumberPrimeTest() {
		Primes prime = new Primes(10);
		boolean test1 = prime.isPrime(3);
		boolean test2 = prime.isPrime(6);
		assertTrue(test1);
		assertFalse(test2);
	}

}
