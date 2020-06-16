package pro.com.StrangeLetter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StrangeLetterTest {

	@Test
	void test() {
		StrangeLetter sl = new StrangeLetter();
		assertEquals("TrY HeLlO WoRlD", sl.solution("try hello world"));
	}

	@Test
	void test2() {
		StrangeLetter sl = new StrangeLetter();
		assertEquals("Tw Ye H L O WoRlD", sl.solution("tW ye h l o world"));
	}

	@Test
	void test3() {
		StrangeLetter sl = new StrangeLetter();
		assertEquals("TwE Y H L O WoRlD", sl.solution("tWe y h l o world"));
	}

	@Test
	void test4() {
		StrangeLetter sl = new StrangeLetter();
		assertEquals("WoRlD", sl.solution("WORLD"));
	}
	
	@Test
	void test5() {
		StrangeLetter sl = new StrangeLetter();
		assertEquals("WoRlD ", sl.solution("WORLD "));
	}

}
