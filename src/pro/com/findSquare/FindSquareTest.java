package pro.com.findSquare;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindSquareTest {
	
	@Test
	void test() {
		FindSquare fs = new FindSquare();
		
		assertThat(fs.solution(3, 3), is(6L));
	}

	@Test
	void test2() {
		FindSquare fs = new FindSquare();
		
		assertThat(fs.solution(8, 12), is(80L));
	}

}
