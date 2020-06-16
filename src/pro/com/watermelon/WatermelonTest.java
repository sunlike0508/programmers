package pro.com.watermelon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WatermelonTest {

	@Test
	void test() {
		Watermelon wm = new Watermelon();
		assertEquals("수박수", wm.solution(3));
		assertEquals("수박수박", wm.solution(4));
		assertEquals("수박수박수박수박수박수", wm.solution(11));
		assertEquals("수박수박수박수박수박수박", wm.solution(12));
	}

}
