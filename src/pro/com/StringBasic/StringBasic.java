package pro.com.StringBasic;

public class StringBasic {
    public boolean solution(String s) {
        
        if(s.length() == 4 || s.length() == 6) {
        	return s.length() == s.replaceAll("[^0-9]", "").length();
        }
        
        return false;
    }
}
