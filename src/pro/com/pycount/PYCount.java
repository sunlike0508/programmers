package pro.com.pycount;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PYCount {
	boolean solution(String s) {
		
        s = s.toUpperCase().replaceAll("[^PY]", "");
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if('P' == s.charAt(i)) {
        		count++;
        	}
        }

        return count * 2 == s.length();
    }
}
