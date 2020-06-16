package pro.com.findPrime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeTest {

	@Test
	void test() {
		Prime prime = new Prime();
		
		assertEquals(4, prime.solution(10));
	}

}
