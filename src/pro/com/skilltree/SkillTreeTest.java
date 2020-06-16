package pro.com.skilltree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkillTreeTest {

	//"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
	@Test
	void test() {
		SkillTree st = new SkillTree();
		assertEquals(2, st.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
	}

}
