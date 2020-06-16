package pro.com.StringOrderBy;

import java.util.Arrays;
import java.util.Collections;

public class StringOrderby {
    public String solution(String s) {
    	
    	String[] string = s.split("");
    	
    	Arrays.sort(string, Collections.reverseOrder());
       
        return String.join("", string);
    }
}
