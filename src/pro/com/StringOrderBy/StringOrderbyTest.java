package pro.com.StringOrderBy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringOrderbyTest {
	
	@Test
	void test() {
		StringOrderby so = new StringOrderby();
		assertEquals("gfedcbZ", so.solution("Zbcdefg"));
		assertEquals("cbaCBA", so.solution("ABCabc"));
		assertEquals("cba", so.solution("abc"));
	}

}
