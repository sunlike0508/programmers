package parseInt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParseIntTest {

	@Test
	void test() {
		ParseInt pi = new ParseInt();
		
		assertEquals(-1234, pi.solution("-1234"));
		assertEquals(1234, pi.solution("+1234"));
		assertEquals(1234, pi.solution("1234"));
	}

}
