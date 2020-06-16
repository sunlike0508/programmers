package pro.com.KakaoBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KakaoBookTest {

	@Test
	void test() {
		KakaoBook kb = new KakaoBook();
		assertArrayEquals(new int[] {4, 5}, 
				kb.solution(6, 4, new int[][] {{1, 1, 1, 0}, 
											   {1, 2, 2, 0}, 
											   {1, 0, 0, 1}, 
											   {0, 0, 0, 1}, 
											   {0, 0, 0, 3}, 
											   {0, 0, 0, 3}}));
	}

}
