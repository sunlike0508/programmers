package pro.com.StringCompression;

public class StringCompression {
    public int solution(String s) {
        
        int min = s.length();
        
        for(int i = 1; i <= s.length() / 2 ; i++) {
        	int count = 1;
        	String compare = "";
        	String compression = "";
        	
        	for(int j = 0; j < s.length(); j += i) {
        		String subString = s.substring(j,j+i > s.length()? s.length() : j+i);
        		
        		if(compare.equals(subString)) {
        			count++;
        		} else {
        			
        			if(count > 1) {
        				compression += count + compare;
        				count = 1;
        			} else {
        				compression += compare;
        			}
        			
        			compare = subString;
        		}
        	}
        	
			if(count > 1) {
				compression += count + compare;
			} else {
				compression += compare;
			}
        	
        	if(compression.length() < min) {
        		min = compression.length();
        	}
        }
        
        return min;
    }
}
