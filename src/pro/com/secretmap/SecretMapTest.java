package pro.com.secretmap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecretMapTest {
	
	@Test
	void test() {
		SecretMap sm = new SecretMap();
		
		assertThat(sm.solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28}) , 
				is(new String[] {"#####","# # #", "### #", "#  ##", "#####"}));
	}
	
	@Test
	void test2() {
		SecretMap sm = new SecretMap();
		
		assertThat(sm.solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10}) , 
				is(new String[] {"######", "###  #", "##  ##", " #### ", " #####", "### # "}));
	}

}
