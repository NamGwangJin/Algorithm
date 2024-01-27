import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<intStrs.length; i++) {
        	int temp1 = Integer.parseInt(intStrs[i].substring(s, s+l));
        	if ( temp1 > k ) {
        		temp.add(temp1);
        	}
        }
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++) {
        	answer[i] = temp.get(i);
        }
        return answer;
    }
}