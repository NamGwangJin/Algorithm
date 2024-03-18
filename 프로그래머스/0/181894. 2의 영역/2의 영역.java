import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> two_index = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                two_index.add(i);
            }
        }
        
        int[] answer;
        if (two_index.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else if (two_index.size() == 1) {
            answer = new int[1];
            answer[0] = arr[two_index.get(0)];
        } else {
            answer = new int[two_index.get(two_index.size() - 1) - two_index.get(0) + 1];
            int answer_index = 0;
            for (int i = two_index.get(0); i <= two_index.get(two_index.size() - 1); i++) {
                answer[answer_index] = arr[i];
                answer_index++;
            }
        }
        
        return answer;
    }
}