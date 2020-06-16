package pro.com.StrangeLetter;

public class StrangeLetter {
    public String solution(String s) {
    	
    	String answer = "";
    	boolean loc = true;
        
        for(int i = 0; i < s.length(); i++) {
        	String subString = s.substring(i, i+1);
        	
        	if(" ".equals(subString)) {
        		loc = true;
        	} else {
        		
        		if(loc) {
        			subString = subString.toUpperCase();
        		} else {
        			subString = subString.toLowerCase();
        		}
        		
        		loc = !loc;
        	}
        	
        	answer += subString;
        }
        
        return answer;
    }
}
