package pro.com.Stock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockTest {

	@Test
	void test() {
		Stock stock = new Stock();
		assertArrayEquals(new int[] {4, 3, 1, 1, 0 }, stock.solution(new int[] { 1, 2, 3, 2, 3 }));
	}
				
	@Test
	void test_2() {
		Stock stock = new Stock();
		assertArrayEquals(new int[] {4, 3, 2, 1, 0 }, stock.solution(new int[] { 2, 3, 4, 5, 4 }));
	}
	
	@Test
	void test_3() {
		Stock stock = new Stock();
		assertArrayEquals(new int[] {4, 3, 2, 1, 0 }, stock.solution(new int[] { 2, 3, 4, 5, 1 }));
	}

}
