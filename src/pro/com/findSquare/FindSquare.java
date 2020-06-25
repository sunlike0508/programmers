package pro.com.findSquare;

public class FindSquare {
    public long solution(int w, int h) {
    	
    	return (long)w*(long)h - (w+h-gcd(w,h));

    }

	private int gcd(int w, int h) {
		
		if(w == 0) {
			return h;
		}
		
		return gcd(h % w, w);
	}
}
