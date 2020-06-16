package pro.com.ReverseArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseArrayTest {

	@Test
	void test() {
		ReverseArray ra = new ReverseArray();
		assertArrayEquals(new int[] {5,4,3,2,1}, ra.solution(12345));
	}

}
