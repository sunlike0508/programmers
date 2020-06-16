package pro.com.Caesar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarTest {

	@Test
	void test() {
		Caesar cs = new Caesar();
		assertEquals("BC", cs.solution("AB", 1));
		assertEquals("e F d", cs.solution("a B z", 4));
	}

}
