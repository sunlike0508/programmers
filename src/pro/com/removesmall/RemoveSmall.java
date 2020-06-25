package pro.com.removesmall;

import java.util.ArrayList;
import java.util.List;

public class RemoveSmall {
	public int[] solution(int[] arr) {
    	if(arr.length == 1) {
    		return new int[] {-1};
    	}
    	
    	List<Integer> list = new ArrayList<Integer>();
    	int min = Integer.MAX_VALUE;
    	int index = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < arr.length; i++) {
    		list.add(arr[i]);
    		
    		if(min > arr[i]) {
    			min = arr[i];
    			index = i;
    		}
    	}
    	
    	list.remove(index);
    	
    	int[] answer = new int[list.size()];
    	
    	for(int i = 0; i < answer.length; i++) {
    		answer[i] = list.get(i);
    	}
        
        return answer;
    }
}
