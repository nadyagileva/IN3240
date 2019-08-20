package primes;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class PrimesTest {

	@Test
	public void testPrimes() {
		Primes prime = new Primes(10);
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(0);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(5);
		test.add(7);
		ArrayList<Integer> result = prime.returnPrimes();
		assertEquals(test, result);
	}
}
