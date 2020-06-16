package pro.com.middleChar;

public class MiddleChar {
    public String solution(String s) {
    	
    	int sLengthHalf = s.length() / 2;
        
        return (s.length() % 2 == 0) ? s.substring(sLengthHalf-1, sLengthHalf+1) : s.substring(sLengthHalf, sLengthHalf+1);
    }
}
