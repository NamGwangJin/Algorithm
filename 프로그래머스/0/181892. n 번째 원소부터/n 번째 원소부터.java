class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int answer_index = 0;
        
        for (int i=n-1; i<num_list.length; i++){
            answer[answer_index] = num_list[i];
            answer_index++;
        }
        
        return answer;
    }
}