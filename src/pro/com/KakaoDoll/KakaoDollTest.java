package pro.com.KakaoDoll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KakaoDollTest {
//[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4
	@Test
	void test() {
		KakaoDoll kd = new KakaoDoll();
		assertEquals(4, kd.solution(
				new int[][]{{0,0,0,0,0},
							{0,0,1,0,3},
							{0,2,5,0,1},
							{4,2,4,4,2},
							{3,5,1,3,1}}
		, new int[] {1,5,3,5,1,2,1,4}));
	}

}
