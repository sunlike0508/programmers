package pro.com.gymsuit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class GymsuitTest {
	@Test
	void test() {
		Gymsuit gs = new Gymsuit();
		assertEquals(6, gs.solution(7, new int[]{2, 3, 4}, new int[]{1, 2, 3, 6}));
	}
	
	@Test
	void test2() {
		Gymsuit gs = new Gymsuit();
		assertThat(gs.solution(5, new int[] {1, 2}, new int[] {2, 3}), is(4));
	}
	
	@Test
	void test3() {
		Gymsuit gs = new Gymsuit();
		assertThat(gs.solution(3, new int[] {3}, new int[] {1}), is(2));
	}
	
	@Test
	void test4() {
		Gymsuit gs = new Gymsuit();
		assertThat(gs.solution(5, new int[] {2,3}, new int[] {3,4}), is(4));
	}
	
	@Test
	void test5() {
		Gymsuit gs = new Gymsuit();
		assertThat(gs.solution(5, new int[] {3}, new int[] {3,4}), is(5));
	}
	
	@Test
	void test6() {
		Gymsuit gs = new Gymsuit();
		assertThat(gs.solution(5, new int[] {2, 3}, new int[] {1}), is(4));
	}
	
	@Test
	void test7() {
		Gymsuit gs = new Gymsuit();
		assertThat(gs.solution(5, new int[] {2, 4}, new int[] {1,3,5}), is(5));
	}
}
