package pro.com.Collatz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollatzTest {

	@Test
	void test() {
		Collatz tz = new Collatz();
		assertThat(tz.solution(6), is(8));
		assertThat(tz.solution(16), is(4));
		assertThat(tz.solution(626331), is(-1));
	}

}
