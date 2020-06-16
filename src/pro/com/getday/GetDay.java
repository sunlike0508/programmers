package pro.com.getday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDay {
    public String solution(int a, int b) throws ParseException {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd") ;
        Calendar cal = Calendar.getInstance() ;
        cal.setTime(dateFormat.parse("2016" + (a > 9 ? a : "0"+ a) + (b > 9 ? b : "0"+ b)));
        
        return day[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
}
