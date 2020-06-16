package pro.com.pycount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PYCountTest {

	@Test
	void test() {
		PYCount py = new PYCount();
		
		assertTrue(py.solution("pPoooyY"));
		assertFalse(py.solution("pPoooy"));
		assertTrue(py.solution("ooo"));
	}

}
