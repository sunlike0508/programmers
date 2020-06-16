package pro.com.SumDivisor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumDivisorTest {

	@Test
	void test() {
		SumDivisor sum = new SumDivisor();
		assertEquals(28, sum.solution(12));
	}

}
