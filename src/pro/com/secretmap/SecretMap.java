package pro.com.secretmap;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
    	String[] overlap = new String[n];
        
        for(int i = 0; i < n ; i++) {
        	overlap[i] = String.format("%" + n + "s",Integer.toBinaryString(arr1[i] | arr2[i]));
        }
        
        return spaceWall(overlap);
    }
    
	private String[] spaceWall(String[] overlap) {
		
		for(int i = 0; i < overlap.length; i++) {
			overlap[i] = overlap[i].replaceAll("1", "#");
			overlap[i] = overlap[i].replaceAll("0", " ");
		}
		
		return overlap;
	}
}
