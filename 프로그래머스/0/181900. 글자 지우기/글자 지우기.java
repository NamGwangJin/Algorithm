class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean stop = false;

        for (int i = 0 ; i < my_string.length(); i++) {
        	stop = false;
        	for (int x = 0 ; x < indices.length ; x++) {
        		if ( indices[x] == i ) {
        			stop = true;
        			break;
        		}
        	}
        	if ( stop == true ) continue;
        	answer += my_string.substring(i, i+1);
        }

        return answer;
    }
}