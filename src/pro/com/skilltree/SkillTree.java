package pro.com.skilltree;

public class SkillTree {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (String skill_tree : skill_trees) {

			skill_tree = skill_tree.replaceAll("[^" + skill + "]", "");

			if(skill_tree.equals(skill.substring(0, skill_tree.length()))) {
				answer++;
			}
		}

		return answer;
	}
}
