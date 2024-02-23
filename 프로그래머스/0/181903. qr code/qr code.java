class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        for (int i = 0; i < code.length(); i++) {
        	if (i % q == r) {
        		char index_code = code.charAt(i);
        		answer += index_code;
        	}
        }
        
        return answer;
    }
}