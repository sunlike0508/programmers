package pro.com.Harshad;

public class Harshad {
	public boolean solution(int x) {
		
		return x % digitSum(x) == 0;
	}

	private int digitSum(int x) {
		int sum = 0;
		
		while(x > 0) {
			sum += x % 10;
			x = x / 10;
		}

		return sum;
	}
}
