package pro.com.middleChar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiddleCharTest {

	@Test
	void test() {
		MiddleChar mc = new MiddleChar();
		
		assertEquals("c", mc.solution("abcde"));
	}
	
	@Test
	void test_02() {
		MiddleChar mc = new MiddleChar();
		
		assertEquals("we", mc.solution("qwer"));
	}
	
	@Test
	void test_03() {
		MiddleChar mc = new MiddleChar();
		
		assertEquals("er", mc.solution("qwerrt"));
	}

}
