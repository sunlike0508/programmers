package pro.com.Caesar;

public class Caesar {
    public String solution(String s, int n) {
        
        char[] arr = s.toCharArray();
        String[] strArray = new String[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
        	strArray[i] = caesarSecurity(arr[i], n);
        }
        
        return String.join("", strArray);
    }

	private String caesarSecurity(char c, int n) {
		
		if(c == ' ') {
			return " ";
		}
		
		if('a' <= c) {
			return String.valueOf((char)('a' + (c - 'a' + n) % 26));
		}
		
		return String.valueOf((char)('A' + (c - 'A' + n) % 26));
	}
}
