package pro.com.MockExam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MockExamTest {

	@Test
	void test() {
		MockExam me = new MockExam();
		assertArrayEquals(new int[] {1}, me.solution(new int[] {1, 2, 3, 4, 5}));
	}
	
	//@Disabled
	@Test
	void test2() {
		MockExam me = new MockExam();
		assertArrayEquals(new int[] {1, 2, 3}, me.solution(new int[] {1, 3, 2, 4, 2}));
	}

}
