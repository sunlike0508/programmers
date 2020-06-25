package pro.com.budget;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BudgetTest {
	@Test
	void test() {
		Budget bg = new Budget();
		assertThat(bg.solution(new int[] {1,3,2,5,4}, 9), is(3));
	}

	@Test
	void test2() {
		Budget bg = new Budget();
		assertThat(bg.solution(new int[] {2,2,3,3}, 10), is(4));
	}

}
