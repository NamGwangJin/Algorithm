class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for ( int i = 0; i < answer.length; i++) {
        	answer[i] = 0;
        }
        
        for ( int i = 0; i < my_string.length(); i++) {
        	char alphabet = my_string.charAt(i);
        	
        	if (alphabet >= 'A' && alphabet <= 'Z') {
            	int order = (int) alphabet - 'A';
            	answer[order] += 1;
        	} else {
            	int order = (int) alphabet - 'A' - 6;
            	answer[order] += 1;
        	}
        }
        
        return answer;
    }
}