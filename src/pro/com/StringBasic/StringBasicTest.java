package pro.com.StringBasic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringBasicTest {

	@Test
	void test() {
		StringBasic sb = new StringBasic();
		assertTrue(sb.solution("1123"));
		assertFalse(sb.solution("a123"));
		assertFalse(sb.solution("12123"));
		assertTrue(sb.solution("112322"));
	}

}
