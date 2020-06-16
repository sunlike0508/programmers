package pro.com.SumTwoNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTwoNumberTest {

	@Test
	void test() {
		SumTwoNumber sn = new SumTwoNumber();
		assertEquals(12, sn.solution(3, 5));
		assertEquals(3, sn.solution(3, 3));
		assertEquals(12, sn.solution(5, 3));
	}

}
