package pro.com.dartgame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DartgameTest {
	@Test
	void test() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1S2D*3T"), is(37));
	}

	@Test
	void test2() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1D2S#10S"), is(9));
	}
	
	@Test
	void test3() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1D2S0T"), is(3));
	}
	
	@Test
	void test4() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1S*2T*3S"), is(23));
	}
	
	@Test
	void test5() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1D#2S*3S"), is(5));
	}
	
	@Test
	void test6() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1T2D3D#"), is(-4));
	}

	@Test
	void test7() {
		Dartgame dartGame = new Dartgame();
		assertThat(dartGame.solution("1D2S3T*"), is(59));
	}
}
