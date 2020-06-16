package pro.com.mySort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MySortTest {
	@Test
	void test() {
		MySort my = new MySort();
		assertArrayEquals(new String[] {"abcd", "abce", "cdx"}, 
				my.solution(new String[] { "abce", "abcd", "cdx"}, 2));
	}

}
