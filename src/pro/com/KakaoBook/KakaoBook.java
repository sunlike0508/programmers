package pro.com.KakaoBook;

public class KakaoBook {

	private static final int VISIT_COLOR = -1;
	private static final int EMPTY_COLOR = 0;
	
	public int[] solution(int m, int n, int[][] picture) {
        int maxSizeOfOneArea = 0;
        int numberOfArea = 0;
        
        int[][] book = new int[m][n];
        
        for(int i = 0; i < picture.length; i++) {
        	System.arraycopy(picture[i], 0, book[i], 0, picture[i].length);
        }

        for(int i = 0; i < book.length; i++) {
        	
        	for(int j = 0; j < book[i].length; j++) {
        		
        		int count = countMaxSizeOfArea(book, i, j, book[i][j]);
        		
        		if(count > 0) {
        			numberOfArea ++;
        		}
        		
        		maxSizeOfOneArea = Math.max(maxSizeOfOneArea, count);
        	}
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }

	private int countMaxSizeOfArea(int[][] book, int x, int y, int color) {
		
		if(x < 0 || y < 0 || x >= book.length || y >= book[x].length) {
			return 0;
		} else if(book[x][y] != color || book[x][y] == VISIT_COLOR || book[x][y] == EMPTY_COLOR) {
			return 0;
		} else {
			book[x][y] = VISIT_COLOR;
			
			return 1 + countMaxSizeOfArea(book,x,y+1,color) 
					+ countMaxSizeOfArea(book,x-1,y,color) 
					+ countMaxSizeOfArea(book,x+1,y,color) 
					+ countMaxSizeOfArea(book,x,y-1,color); 
		}
	}
}
