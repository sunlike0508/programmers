package pro.com.MockExam;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    public int[] solution(int[] answers) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        
        int[][] persons = { {1, 2, 3, 4, 5},
        					{2, 1, 2, 3, 2, 4, 2, 5},
        					{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int temp = 0;
        
        for(int i = 0; i < persons.length; i++) {
        	int personSum = 0;
        	
        	for(int j = 0; j < persons[i].length; j++) {
        		for(int x = j; x < answers.length; x+=persons[i].length) {
        			if(persons[i][j] == answers[x]) {
        				personSum++;
        			}
        		}
        	}
        	
        	if(personSum == temp) {
        		list.add(i);
        	}
        	
        	if(personSum > temp) {
        		list.clear();
        		list.add(i);
        		temp = personSum;
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i) + 1;
        }
        
        return answer;
    }
}
