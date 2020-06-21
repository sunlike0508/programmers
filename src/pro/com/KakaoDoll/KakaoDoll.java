package pro.com.KakaoDoll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KakaoDoll {
    public int solution(int[][] board, int[] moves) {
    	
    	List<Stack<Integer>> list = new ArrayList<Stack<Integer>>();
    	List<Integer> basket = new ArrayList<Integer>();
    	
    	for(int i = board.length-1; i >=0; i--) {
    		for(int j = 0; j < board.length; j++) {
    			if(i == board.length-1) {
    				Stack<Integer> stack = new Stack<Integer>();
    				
    				if(board[i][j] != 0) {
    					stack.add(board[i][j]);
    				}
    				
    				list.add(stack);
    			} else  {
    				if(board[i][j] != 0) {
    					list.get(j).push(board[i][j]);
    				}
    			}
    		}
    	}
    	
    	int answer = 0;
    	
    	for(int i = 0; i < moves.length; i++) {
    		if(!list.get(moves[i]-1).isEmpty()) {
    			basket.add(list.get(moves[i]-1).pop());
    		}
    		
    		answer += removeDoll(basket);
    	}
    	
    	
        return answer;
    }

	private int removeDoll(List<Integer> basket) {
		
		if(basket.isEmpty() || basket.size() == 1) {
			return 0;
		}
		
		int count = 0;
		
		for(int i = 0; i < basket.size()-1; i++) {
			if(basket.get(i) == basket.get(i+1)) {
				basket.remove(i);
				basket.remove(i);
				count+=2;
			}
		}
		
		return count;
	}

}
