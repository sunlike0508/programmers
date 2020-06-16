package pro.com.samedigit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SameDigitTest {

	@Test
	void test() {
		SameDigit sd = new SameDigit();
		
		assertArrayEquals(new int[] {1,3,0,1}, sd.solution(new int[] {1,1,3,3,0,1,1}));
	}

}
