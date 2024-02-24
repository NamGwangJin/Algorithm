import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for (int i = 1; i <= n ; i++) {
            if ( i % k == 0 ) {
                answerList.add(i);
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}