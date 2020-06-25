package pro.com.Collatz;

public class Collatz {
	public int solution(int num) {
        int answer = 0;
        
        long collatz = num;
        
        while(answer < 500){
        	
            if(collatz == 1) {
            	return answer;
            }
            
            if(collatz % 2 == 0){
            	collatz = collatz / 2 ;
            } else {
            	collatz = collatz * 3 + 1;
            }
            
            answer++;
        }
        
        return -1;
    }
}
