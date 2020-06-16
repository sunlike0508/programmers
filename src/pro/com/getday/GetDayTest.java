package pro.com.getday;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

class GetDayTest {

	@Test
	void test() throws ParseException {
		GetDay gd = new GetDay();
		assertEquals("TUE", gd.solution(5, 24));
	}

}
