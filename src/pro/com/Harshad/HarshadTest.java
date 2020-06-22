package pro.com.Harshad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HarshadTest {

	@Test
	void test() {
		Harshad hs = new Harshad();
		assertTrue(hs.solution(18));
		assertFalse(hs.solution(19));
	}

}
