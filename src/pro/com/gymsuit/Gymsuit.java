package pro.com.gymsuit;

public class Gymsuit {
	public int solution(int n, int[] lost, int[] reserve) {
		
		int[] suit = new int[n+1];

		for(int i = 0; i < lost.length; i++) {
			suit[lost[i]] = 1;
		}
		
		for(int i = 0; i < reserve.length; i++) {
			if(suit[reserve[i]] == 1) {
				suit[reserve[i]] = 0;
				reserve[i] = 0;
			}
		}
		
		for(int i = 0; i < reserve.length; i++) {
			int spareSuit = reserve[i];
			
			if(spareSuit == 1 && suit[spareSuit+1] == 1) {
				suit[spareSuit+1] = 0;
			} 
			
			if(spareSuit == n && suit[spareSuit-1] == 1) {
				suit[spareSuit-1] = 0;
			}
			
			if(spareSuit > 1 && spareSuit < n) {
				boolean check = true;
				
				if(suit[spareSuit-1] == 1) {
					suit[spareSuit-1] = 0;
					check = false;
				}
				
				if(suit[spareSuit+1] == 1 && check) {
					suit[spareSuit+1] = 0;
				}
			}
		}
		
		int answer = 0;
		
		for(int i = 1; i < n+1; i++) {
			if(suit[i] == 0) {
				answer++;
			}
		}
		
		return answer;
	}
}
