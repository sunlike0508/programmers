package pro.com.StringCompression;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringCompressionTest {
	
	StringCompression sc;
	
	@BeforeEach
	void setUp() {
		sc = new StringCompression();
	}
	
	@Test
	void test() {
		assertEquals(7, sc.solution("aabbaccc"));
	}
	
	//@Disabled
	@Test
	void test2() {
		assertEquals(9, sc.solution("ababcdcdababcdcd"));
	}
	//@Disabled
	@Test
	void test3() {
		assertEquals(8, sc.solution("abcabcdede"));
	}
	//@Disabled
	@Test
	void test4() {
		assertEquals(14, sc.solution("abcabcabcabcdededededede"));
	}
	//@Disabled
	@Test
	void test5() {
		assertEquals(17, sc.solution("xababcdcdababcdcd"));
	}

}
