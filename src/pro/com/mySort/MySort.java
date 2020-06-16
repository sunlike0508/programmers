package pro.com.mySort;

import java.util.Arrays;

public class MySort {
    public String[] solution(String[] strings, int n) {
        
        for(int i = 0; i < strings.length ; i++) {
        	strings[i] = strings[i].substring(n,n+1) + strings[i].substring(0, n) + strings[i].substring(n+1);
        }
        
        Arrays.sort(strings);
        
        for(int i = 0; i < strings.length ; i++) {
        	strings[i] = strings[i].substring(1, n+1) + strings[i].substring(0,1) + strings[i].substring(n+1);
        }
        
        return strings;
    }
}

