package pro.com.removesmall;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveSmallTest {

	@Test
	void test() {
		RemoveSmall rs = new RemoveSmall();
		assertThat(rs.solution(new int[] {3, 1, -2, 5}), is(new int[] {3,1,5}));
	}

}
