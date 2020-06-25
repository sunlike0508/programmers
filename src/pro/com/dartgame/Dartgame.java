package pro.com.dartgame;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dartgame {
	
    public int solution(String dartResult) {

    	Pattern dartToken = Pattern.compile("\\d{1,2}\\D[\\*#]?");
    	Matcher dartMatcher = dartToken.matcher(dartResult);
    	List<Integer> pointList = new ArrayList<Integer>();

		while (dartMatcher.find()) {
			String pointGroup = dartMatcher.group();
			
			int point = Integer.parseInt(pointGroup.replaceAll("[^0-9]", ""));
			String bouns = pointGroup.replaceAll("[^(S|D|T)]", "");
			String option = pointGroup.replaceAll("[0-9][S|D|T]", "");
			
			if(!"S".equals(bouns)) {
				point = (int) Math.pow(point, "D".equals(bouns) ? 2 : 3);
			}
			
			if("#".equals(option)) {
				point *= -1;
			}
			
			if("*".equals(option)) {
				point *= 2;
				
				if(pointList.size() > 0) {
					pointList.set(pointList.size()-1, pointList.get(pointList.size()-1) * 2);
				}
			}
			
			pointList.add(point);
		}
		
        int answer = 0;
        
        for(int point : pointList) {
        	answer += point;
        }
        
        return answer;
    }
}
