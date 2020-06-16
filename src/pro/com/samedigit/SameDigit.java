package pro.com.samedigit;

import java.util.ArrayList;
import java.util.List;

public class SameDigit {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int temp = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != temp) {
        		list.add(arr[i]);
        		temp = arr[i];
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
    }
}
